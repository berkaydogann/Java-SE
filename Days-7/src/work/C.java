package work;

public class C extends B {
    @Override
    public void action(int num1, int num2) {
        int end = num1 * num2+10;
        write(end);
    }
}
