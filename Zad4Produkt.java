public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    public Produkt(int id, String nazwa, String kategoria, double cena, int iloscWMagazynie) {
        this.id = id;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
        this.iloscWMagazynie = iloscWMagazynie;
    }
    public int getId() { return id; }
    public String getNazwa() { return nazwa; }
    public String getKategoria() { return kategoria; }
    public double getCena() { return cena; }
    public int getIloscWMagazynie() { return iloscWMagazynie; }
    public void setIloscWMagazynie(int iloscWMagazynie) { this.iloscWMagazynie = iloscWMagazynie; }
    public void wyswietlInformacje() {
        System.out.printf("ID: %d | Nazwa: %s | Kategoria: %s | Cena: %.2f zł | W magazynie: %d szt.\n",
                id, nazwa, kategoria, cena, iloscWMagazynie);
    }
}