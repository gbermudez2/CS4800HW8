

public class WaitingForMoneyState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Waiting for deposit.");
    }

    @Override
    public void insertMoney(double amount) {
        double price = vendingMachine.getSnackPrice(vendingMachine.getSelectedSnack());
        if (amount >= price) {
            vendingMachine.setCurrentState(vendingMachine.getDispensingState());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please insert money.");
    }
}
