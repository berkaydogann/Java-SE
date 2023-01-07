package Static;

public class MainAppStaticMethod {
    public static void main(String[] args) {
        //Static method call
        Settings.action();
        String address = "Antalya";
        System.out.println(address);

        //Static object using
        System.out.println(Settings.user.hashCode());
        Settings.user.getEmail();
        Settings.user.email = "test@mail.com";
        Settings.user.getEmail();

        //Settings.user = new User(); //User'i final yaptığımız için olmaz
        System.out.println(Settings.user.hashCode());

        MainAppStaticMethod mainAppStaticMethod = new MainAppStaticMethod();
        mainAppStaticMethod.read();

    }

    public void read() {
        System.out.println("Read called");
    }
}
