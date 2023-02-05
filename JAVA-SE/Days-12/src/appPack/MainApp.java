package appPack;

public class MainApp {
    public static void main(String[] args) {

        try {
            String stNum = "30a";
            int num = Integer.parseInt(stNum);
            int i = 1 / 0;
            System.out.println("Code block success");
        } catch (Exception ex) {
            System.err.println("Code block Fail: ");
            ex.printStackTrace();
        }

        Action action = new Action();
        try {
            action.call(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
