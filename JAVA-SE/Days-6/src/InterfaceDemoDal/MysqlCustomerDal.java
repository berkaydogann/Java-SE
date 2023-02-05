package InterfaceDemoDal;

public class MysqlCustomerDal implements  ICustomerDal{
    @Override
    public void insert() {
        System.out.println("Mysql insert başarılı");
    }
}
