package Work;

public class Kare extends Cizim {

    public Kare() {
        super(19);
    }

    public Kare(int kareBorder) {
        super(kareBorder);
    }

    @Override
    public void ciz() {
        cizimYap("kare");
    }

    @Override
    public String toString() {
        return "Kare Class";
    }

    public void action(int i) {
        if (i > 5) {
            ciz();  //Override edilen Kare içindeki ciz
        } else {
            super.ciz();  //Cizim altındaki ciz() calısır
        }
    }
}
