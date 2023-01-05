package works;

public class Action {
    //Kurucu Methodlar
    String data = "";
    Settings settings = new Settings();

    public Action() {
        System.out.println("Default Action Called.");
        read();
    }

    public Action(String data) {
        System.out.println("Action called: " + data);
        this.data = data;
    }

    public void count() {
        System.out.println("This data:" + this.data.length());
    }

    public void read() {
        System.out.println("Read method called.");
    }
}
