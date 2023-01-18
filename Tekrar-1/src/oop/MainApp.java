package oop;

public class MainApp {
    public static void main(String[] args) {
        Action action1 = new Action();
        Action action = new Action(5);
        Action action2 = new Action(new Settings());

        System.out.println(action.a);
        System.out.println(action.call());

        System.out.println(action1.a);
        System.out.println(action1.call());

        System.out.println(action2.a);
        System.out.println(action2.call());

        action.a = 0;
        action1.a = 20;
        action2.a = 30;

        System.out.println(action.call()); // ilk calıstıgında 0, action1.call() -> 400, action2.call() -> 900 gelir.

        System.out.println(Settings.minus(1, 5));

        Settings.Profile profile = new Settings().new Profile();
        System.out.println( profile.age );
    }
}
