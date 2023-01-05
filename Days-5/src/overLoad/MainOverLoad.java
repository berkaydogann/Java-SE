package overLoad;

public class MainOverLoad {
    public static void main(String[] args) {
        int age = 24;
        String name = "Berkay";
        float num1 = 10.5f;
        Object obj = 42.6;

        String cStr = "" + num1;
        String cString = String.valueOf(age);

        Action action = new Action();
        byte num = 10;
        System.out.println(action.call(num));
        System.out.println(action.call(10.5f));
    }
}
