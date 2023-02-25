package useAbstract.abstractDemo;

public class MainDatabase {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new PostresqlDatabaseManager();
        customerManager.getCustomers();
    }
}
