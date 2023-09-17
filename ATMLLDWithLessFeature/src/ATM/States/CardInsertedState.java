package ATM.States;

import ATM.ATMMachine;

public class CardInsertedState implements State{
    ATMMachine atmMachine;

    public CardInsertedState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already got inserted..!!");
    }

    @Override
    public void enterPin() {
        boolean isValidPin = atmMachine.readAndvalidatePin();
        if(!isValidPin) {
            atmMachine.ejectCard();
            atmMachine.setCurrentState(atmMachine.getNoCardInsertedState());
            return;
        }
        atmMachine.setCurrentState(atmMachine.getWithdrawMoneyState());
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Please insert your card before withdrawing the amount.");
    }
}
