package InheritanceDemo;

public class KrediUI {
    BaseKrediManager baseKrediManager;
    public KrediUI(BaseKrediManager baseKrediManager){
        this.baseKrediManager = baseKrediManager;
    }
    public void KrediHesapla() {
        //Arayüz, butonlar vs vs
        System.out.println(baseKrediManager.getClass().toString() +" cagrıldı");
    }
}
