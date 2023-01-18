package Inheritance;

public class Dikdortgen extends Draw {
    public Dikdortgen(){
        super(15);
    }
    @Override
    public void ciz() {
        pixel("Dikdortgen", 15, 50);
    }
}
