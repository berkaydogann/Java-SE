package useAbstract.Example;

public class MainGame {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator(5);
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new OlderGameCalculator();
        gameCalculator.hesapla();
    }
}
