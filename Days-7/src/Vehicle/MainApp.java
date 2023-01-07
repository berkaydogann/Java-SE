package Vehicle;

public class MainApp {
    public static void main(String[] args) {
        Otomobil otomobil = new Otomobil();
        Kamyon kamyon = new Kamyon();
        Bisiklet motor = new Bisiklet();
        Arac arac = new Arac();

        otomobil.hiz(4, 2020);
        otomobil.hesapla();

        kamyon.hiz(3,2000);
        kamyon.hesapla();

        motor.hiz(2,1990);
    }
}
