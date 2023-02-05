package InterfaceDemoDal;

public class CustomerManager {

    ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    public void add() {
        //İş kodları yazılır. Mesela veriler doğru mu, müşteri varmı gibi.
        iCustomerDal.insert();
    }

}
