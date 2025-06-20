public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private boolean czyStaly;

    public Klient(int id, String imie, String nazwisko, boolean czyStaly) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.czyStaly = czyStaly;
    }

    // Gettery
    public int getId() { return id; }
    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }
    public boolean isCzyStaly() { return czyStaly; }

    public void wyswietlInformacje() {
        System.out.printf("ID: %d | Klient: %s %s | Stały klient: %s\n",
                id, imie, nazwisko, (czyStaly ? "Tak" : "Nie"));
    }
}