public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscmagaz;

    public Produkt(int id, String nazwa, String kategoria, double cena, int iloscmagaz) {
        this.id = id;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
        this.iloscmagaz = iloscmagaz;
    }

    public int getId() {
        return id;
    }
    public String getNazwa() {
        return nazwa;
    }
    public String getKategoria() {
        return kategoria;
    }
    public double getCena() {
        return cena;
    }
    public int getiloscmagaz() {
        return iloscmagaz;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    public void setiloscmagaz(int iloscmagaz) {
        this.iloscmagaz = iloscmagaz;
    }

    public void wyswietlInformacje() {
        System.out.println("--- Informacje o Produkcie ---");
        System.out.println("ID: " + id);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Kategoria: " + kategoria);
        System.out.println("Cena: " + cena + " zł");
        System.out.println("Ilość w magazynie: " + iloscmagaz);
        System.out.println("----------------------------");
    }
}