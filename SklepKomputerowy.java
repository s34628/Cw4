import java.util.ArrayList;
import java.util.List;

public class SklepKomputerowy {
    private List<Produkt> produkty = new ArrayList<>();
    private List<Klient> klienci = new ArrayList<>();
    private List<Zamowienie> zamowienia = new ArrayList<>();

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }
    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void utworzZamowienie(Klient klient, Produkt[] produktyDoZamowienia, int[] ilosci) {

        for (int i = 0; i < produktyDoZamowienia.length; i++) {
            if (produktyDoZamowienia[i].getIloscWMagazynie() < ilosci[i]) {
                System.out.println("Błąd: Brak wystarczającej ilości produktu: " + produktyDoZamowienia[i].getNazwa());
                return;
            }
        }

        int noweId = zamowienia.size() + 1;
        Zamowienie noweZamowienie = new Zamowienie(noweId, klient, produktyDoZamowienia, ilosci);
        zamowienia.add(noweZamowienie);
        System.out.println("Utworzono zamówienie ID: " + noweId);

        for (int i = 0; i < produktyDoZamowienia.length; i++) {
            int nowaIlosc = produktyDoZamowienia[i].getIloscWMagazynie() - ilosci[i];
            produktyDoZamowienia[i].setIloscWMagazynie(nowaIlosc);
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zam : zamowienia) {
            if (zam.getId() == idZamowienia) {
                zam.setStatus(nowyStatus);
                return;
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("\n--- Zamówienia klienta ID: " + idKlienta + " ---");
        for (Zamowienie zam : zamowienia) {
            if (zam.getKlient().getId() == idKlienta) {
                zam.wyswietlSzczegoly();
            }
        }
    }
    public void wyswietlWszystkieProdukty() {
        System.out.println("\n--- Aktualny stan magazynowy ---");
        for (Produkt p : produkty) {
            p.wyswietlInformacje();
        }
    }
}