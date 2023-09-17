package ATM.States;

import ATM.ATMMachine;

public class NoCardInsertedState implements State{
    ATMMachine atmMachine;

    public NoCardInsertedState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted.");
        atmMachine.setCurrentState(atmMachine.getCardInsertedState());
    }

    @Override
    public void enterPin() {
        System.out.println("Please insert card first.");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Please insert card first and then enter pin and then you can withdraw amount.");
    }
}
