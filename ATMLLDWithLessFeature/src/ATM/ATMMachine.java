package ATM;

import ATM.Components.Keypad;
import ATM.States.CardInsertedState;
import ATM.States.NoCardInsertedState;
import ATM.States.State;
import ATM.States.WithdrawMoneyState;

import java.io.InputStream;

public class ATMMachine extends ATMMachineAPI{
    private State noCardInsertedState;
    private State cardInsertedState;
    private State withdrawMoneyState;
    private State currentState;
    private Keypad keypad;
    private double balance;
    public ATMMachine(double balance, InputStream inputStream) {
        noCardInsertedState = new NoCardInsertedState(this);
        cardInsertedState = new CardInsertedState(this);
        withdrawMoneyState = new WithdrawMoneyState(this);
        currentState = noCardInsertedState;

        keypad = new Keypad(inputStream);
        this.balance = balance;
    }

    // Customer
    @Override
    public void insertCard() {
        currentState.insertCard();
    }

    // Customer
    @Override
    public void enterPin() {
        currentState.enterPin();
    }

    // Customer
    @Override
    public void withdrawMoney() {
        currentState.withdrawMoney();
    }

    public boolean readAndvalidatePin() {
       String pin = keypad.readPin();
       // Bank class takes this Pin and Card as argument and validates the pind and return true or false.
        return true;
    }

    public void ejectCard() {
        System.out.println("Please collect your card.");
    }

    public void dispenseAmount() {
        double amount = keypad.readAmount();
        if(balance < amount) {
            System.out.println("Sorry, this ATM didnt have that much amount to dispense.");
            ejectCard();
            return;
        }
        System.out.println("Your amount " + amount + " got dispensed successfully..!!");
        ejectCard();
    }

    /*
                GETTERS AND SETTERS
     */
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getNoCardInsertedState() {
        return noCardInsertedState;
    }

    public State getCardInsertedState() {
        return cardInsertedState;
    }

    public State getWithdrawMoneyState() {
        return withdrawMoneyState;
    }

    public static class ATMMachineImpl {
    }
}
