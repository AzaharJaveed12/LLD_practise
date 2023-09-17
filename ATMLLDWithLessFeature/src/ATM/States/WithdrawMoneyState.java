package ATM.States;

import ATM.ATMMachine;

public class WithdrawMoneyState implements State {
    private ATMMachine atmMachine;

    public WithdrawMoneyState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card is already inserted..!");
    }

    @Override
    public void enterPin() {
        System.out.println("You have already entered correct pin..");
    }

    @Override
    public void withdrawMoney() {
        atmMachine.dispenseAmount();
        atmMachine.setCurrentState(atmMachine.getNoCardInsertedState());
    }
}
