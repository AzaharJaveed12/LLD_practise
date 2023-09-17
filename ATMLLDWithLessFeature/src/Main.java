import ATM.ATMMachine;
import ATM.ATMMachineAPI;

public class Main {
    // this is my client :
    public static void main(String[] args) {
        ATMMachineAPI atmMachine = ATMMachineAPI.getATMMachineAPI(10000.0,System.in);

        atmMachine.withdrawMoney();
        atmMachine.insertCard();
        atmMachine.withdrawMoney();
        atmMachine.enterPin();
        atmMachine.withdrawMoney();
    }
}