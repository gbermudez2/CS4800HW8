// HW8
// Gabriel Bermudez
// CS4800 HW8

public class DispensingState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Already dispensing a snack.");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Already dispensing a snack.");
    }

    @Override
    public void dispenseSnack() {
        String selectedSnack = vendingMachine.getSelectedSnack();
        Snack snack = vendingMachine.getSnack(selectedSnack);

        if (snack.getQuantity() > 0) {
            System.out.println("Dispensing " + selectedSnack);
            snack.decreaseQuantity();
            vendingMachine.setCurrentState(vendingMachine.getIdleState());
        } else {
            System.out.println(selectedSnack + " is out of stock. Please select another snack.");
            vendingMachine.setCurrentState(vendingMachine.getIdleState());
        }
    }
}
