package InterfaceDemoDal;

public class OracleCustomerDal implements ICustomerDal {
    @Override
    public void insert() {
        System.out.println("Oracle insert başarılı");
    }
}
