package Static;

public class Settings {

    final static User user = new User();

    public void userNameSet() {
        System.out.println("userNameSet: " + StaticBankCustomer.name);
        StaticBankCustomer staticBankCustomer = new StaticBankCustomer();
        System.out.println(staticBankCustomer.hashCode() + " " + staticBankCustomer.city);

    }

    //Static Method
    public static void action() {
        String status = "a10";
        System.out.println(status);
        int age = 100;
        System.out.println(age);
    }

}
