package work;

public class Base {

    public Base() {
        System.out.println("B Called");
    }

    public void action(int num1, int num2) {
        int end = num1 * num2;
        write(end);
    }

    public void action(int num1, int num2, int num3) {
        int end = num1 * num2 * num3;
        write(end);
    }

    public void write(int end) {
        System.out.println("Write called! End: " + end);
    }

}
