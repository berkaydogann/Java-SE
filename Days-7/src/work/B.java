package work;

public class B extends Base {
    @Override
    public void action(int num1, int num2) {
        int end = num2 - num1;
        write(end);
    }

    @Override
    public void action(int num1, int num2, int num3) {
        int end = 2 * num1 * num2 * num3;
        write(end);
    }
}
