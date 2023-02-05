package Static;

public class MainApp {
    public static void main(String[] args) {
        Settings settings = new Settings();
        StaticBankCustomer staticBankCustomer = new StaticBankCustomer();

        staticBankCustomer.city = "Ankara";
        System.out.println(staticBankCustomer.hashCode() + " " + staticBankCustomer.city);
        System.out.println(StaticBankCustomer.name);
        settings.userNameSet();
        StaticBankCustomer.name = "Change Name";
        System.out.println(StaticBankCustomer.name);
        settings.userNameSet();


    }
}
