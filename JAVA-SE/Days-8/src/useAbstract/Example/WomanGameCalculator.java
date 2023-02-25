package useAbstract.Example;

public class WomanGameCalculator extends GameCalculator {
    int point;

    public WomanGameCalculator(int point) {
        this.point = point;
        hesapla();
    }

    @Override
    public void hesapla() {
        System.out.println("Puanınız: " + point * 5);
    }
}
