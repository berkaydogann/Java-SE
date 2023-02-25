package useAbstract.Example;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver() {
        System.err.println("Oyun bitti!");
    }
}
