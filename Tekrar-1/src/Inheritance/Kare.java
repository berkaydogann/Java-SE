package Inheritance;

public class Kare extends Draw {
    public Kare() {
        super(5);
    }

    @Override
    public void ciz() {
        super.pixel("Kare", 10, 10);
    }

    public void sum() {

    }
}
