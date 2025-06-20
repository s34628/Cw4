import java.time.LocalDate;
import java.util.Arrays;

public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public Zamowienie(int id, Klient klient, Produkt[] produkty, int[] ilosci) {
        this.id = id;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosci = ilosci;
        this.dataZamowienia = LocalDate.now().toString();
        this.status = "Nowe";
    }
    public int getId() { return id; }
    public Klient getKlient() { return klient; }
    public Produkt[] getProdukty() { return produkty; }
    public int[] getIlosci() { return ilosci; }

    public void setStatus(String status) { this.status = status; }

    public double obliczWartoscZamowienia() {
        double lacznaWartosc = 0.0;
        for (int i = 0; i < produkty.length; i++) {
            lacznaWartosc += produkty[i].getCena() * ilosci[i];
        }
        return lacznaWartosc;
    }
    public double zastosujZnizke() {
        double wartosc = obliczWartoscZamowienia();
        if (klient.isCzyStaly()) {
            wartosc *= 0.90; // 10% zniżki
        }
        return wartosc;
    }
    public void wyswietlSzczegoly() {
        System.out.println("--- Zamówienie ID: " + id + " | Status: " + status + " ---");
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        for (int i = 0; i < produkty.length; i++) {
            System.out.printf("- %s, ilość: %d\n", produkty[i].getNazwa(), ilosci[i]);
        }
        System.out.printf("Wartość po zniżce: %.2f zł\n", zastosujZnizke());
        System.out.println("------------------------------------");
    }
}