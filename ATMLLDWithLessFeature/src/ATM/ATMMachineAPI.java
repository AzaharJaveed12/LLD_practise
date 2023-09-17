package ATM;

import java.io.InputStream;
import java.util.Scanner;

public abstract class ATMMachineAPI {
    public abstract void insertCard();
    public abstract void enterPin();
    public abstract void withdrawMoney();

    public static ATMMachineAPI getATMMachineAPI(double amount, InputStream inputStream) {
        ATMMachineAPI atmMachine = new ATMMachine(amount,inputStream);
        return atmMachine;
    }
}
