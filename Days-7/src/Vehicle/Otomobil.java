package Vehicle;

import java.util.Date;

public class Otomobil extends Arac {
    Date date = new Date();

    @Override
    public void hiz(int lastikSayisi, int yil) {
        double result = lastikSayisi * yil;
        System.out.println("Otomobil içinde Hızınız: " + result);
    }


    //Burda örneğin vergi hesaplaması içni diyelim bu polymorphiz kuralı olmaz. Örneğin bisiklet de bir vehicle diye düşündüm
    //Yada hesapla() Otomobil ve kamyon için polymorfictir.
    public void hesapla() {
        int kalan = date.getYear() - yil;
        System.out.println("Otomobil için: " + kalan);
    }
}
