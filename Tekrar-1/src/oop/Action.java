package oop;

public class Action {
    int a = 10;
    Settings settings = new Settings();

    public Action() {
        System.out.println("Called action constructors " + a);
    }

    public Action(int a) {
        this.a = a;

    }

    public Action(Settings settings) {
        this.a = settings.sum(60, 10);
    }

    public int call() {
        return a * a;
    }
}
