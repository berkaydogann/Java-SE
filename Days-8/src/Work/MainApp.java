package Work;

public class MainApp {
    public static void main(String[] args) {
        Kare kare = new Kare();
        Cember cember = new Cember();
        Ücgen ücgen = new Ücgen();

        call(kare);
        call(cember);
        call(ücgen);

        //System.out.println(kare);
    }

    public static void call(Cizim cizim) {
        cizim.ciz();
        if (cizim instanceof Kare) {
            Kare kare = (Kare) cizim;
            kare.border = 100;
            kare.action(1);
        }
    }
}
