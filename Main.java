public class Main {
    public static void main(String[] args) {
        SklepKomputerowy sklep = new SklepKomputerowy();

        Produkt laptop = new Produkt(1, "Laptop GIGABYTE G5", "Laptop", 5400.00, 10);
        Produkt mysz = new Produkt(2, "Mysz LOGITECH", "Akcesoria", 250.00, 30);
        sklep.dodajProdukt(laptop);
        sklep.dodajProdukt(mysz);

        Klient klient1 = new Klient(1, "Minh", "Pham", false);
        Klient klient2 = new Klient(2, "Andrzej", "Czieslak", true);
        sklep.dodajKlienta(klient1);
        sklep.dodajKlienta(klient2);

        sklep.wyswietlWszystkieProdukty();

        System.out.println("\n-> Tworzenie zamówienia dla Jana...");
        sklep.utworzZamowienie(klient1, new Produkt[]{laptop, mysz}, new int[]{1, 1});

        System.out.println("\n-> Tworzenie zamówienia dla Anny...");
        sklep.utworzZamowienie(klient2, new Produkt[]{laptop}, new int[]{2});

        sklep.wyswietlZamowieniaKlienta(klient1.getId());
        sklep.wyswietlZamowieniaKlienta(klient2.getId());

        sklep.wyswietlWszystkieProdukty();
    }
}