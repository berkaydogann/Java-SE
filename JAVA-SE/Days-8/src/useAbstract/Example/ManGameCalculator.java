package useAbstract.Example;

public class ManGameCalculator extends GameCalculator {
    int point;
    public ManGameCalculator(int point) {
        this.point = point;
        hesapla();
    }

    @Override
    public void hesapla() {
        System.out.println("Puanınız: " + point*3);
    }
}
