package InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.hesapla();

        TarimKrediManager tarimKrediManager = new TarimKrediManager();
        tarimKrediManager.hesapla();

        KrediUI krediUI = new KrediUI(new OgretmenKrediManager());
        krediUI.KrediHesapla();
    }
}
