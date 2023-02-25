package useAbstract.abstractDemo;

public class PostresqlDatabaseManager extends BaseDatabaseManager {

    @Override
    public void getData() {
        System.out.println("Postresql database get data");
    }
}
