// HW8
// Gabriel Bermudez
// CS4800 HW8

public class IdleState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState());
        vendingMachine.setSelectedSnack(snackName);
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please select a snack first.");
    }
}
