package works;

import java.util.Random;

public class BankCustomer {
    public String userName(long customerTc) {
        Random random = new Random();
        String userName = "";
        if (customerTc == 78266265068l) {
            userName = "Berkay";
        } else if (customerTc == 1412515124) {
            userName = "Zehra";
        }
        return userName;
    }
}
