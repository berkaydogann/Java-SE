package Inheritance;

public class MainApp {
    public static void main(String[] args) {
        Draw kare = new Kare();
        Draw ucgen = new Ucgen();
        Draw dikdortgen = new Dikdortgen();

        action(kare);
        action(ucgen);
        action(dikdortgen);

        Settings jframe = new Settings();
        jframe.setSize(300,300);
        jframe.setVisible(true);
    }

    //Polymorphic
    public static void action(Draw draw) {
        draw.ciz();
    }
}
