package work;

public class A extends Base {
    public A(){
        System.out.println("A called");
    }
    @Override
    public void action(int num1, int num2) {
        int end = num1 + num2;
        write(end);
    }
    public void read(){

    }
}
