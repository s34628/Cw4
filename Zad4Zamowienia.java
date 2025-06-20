import java.time.LocalDate;
public class Zamowienie {
    private int id;
    private klienty klienty;
    private Produkt[] produkty;
    private int[] ilosci;
    private String DataZamow;
    private String status;

    public Zamowienie(int id, klienty klienty, Produkt[] produkty, int[] ilosci) {
        this.id = id;
        this.klienty = klienty;
        this.produkty = produkty;
        this.ilosci = ilosci;
        this.DataZamow = LocalDate.now().toString();
        this.status = "Nowe";
    }

    public int getId() {
        return id;
    }
    public klienty getklienty() {
        return klienty;
    }
    public Produkt[] getProdukty() {
        return produkty;
    }
    public int[] getIlosci() {
        return ilosci;
    }
    public String getDataZamow() {
        return DataZamow;
    }
    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setklienty(klienty klienty) {
        this.klienty = klienty;
    }
    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }
    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }
    public void setDataZamow(String DataZamow) {
        this.DataZamow = DataZamow;

    public void setStatus(String status) {
        this.status = status;
    }


    public double obliczWartoscZamowienia() {
        double lacznaWartosc = 0.0;
        for (int i = 0; i < produkty.length; i++) {
            lacznaWartosc += produkty[i].getCena() * ilosci[i];
        }
        return lacznaWartosc;
    }

    public double zastosujZnizke() {
        double wartosc = obliczWartoscZamowienia();
        if (klienty.isCzyStaly()) {
            wartosc = wartosc * 0.90;
        }
        return wartosc;
    }

    public void wyswietlSzczegoly() {
        System.out.println("--- Szczegóły Zamówienia ID: " + id + " ---");
        System.out.println("Data zamówienia: " + DataZamow);
        System.out.println("Status: " + status);
        System.out.println("klienty: " + klienty.getImie() + " " + klienty.getNazwisko());
        System.out.println("Produkty w zamówieniu:");
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("- " + produkty[i].getNazwa() + ", ilość: " + ilosci[i] + ", cena: " + produkty[i].getCena() + " zł");
        }
        System.out.println("------------------------------------");
        System.out.println("Łączna wartość zamówienia: " + obliczWartoscZamowienia() + " zł");
        if (klienty.isCzyStaly()) {
            System.out.println("Wartość po zniżce dla stałego klientya: " + zastosujZnizke() + " zł");
        }
        System.out.println("------------------------------------");
    }
}