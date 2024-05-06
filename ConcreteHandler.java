// HW8
// Gabriel Bermudez
// CS4800 HW8

public class ConcreteHandler extends SnackDispenseHandler {
    private Snack snack;

    public ConcreteHandler(Snack snack) {
        this.snack = snack;
    }

    @Override
    public void handleRequest(String snackName, double amount) {
        if (snackName.equals(snack.getName()) && amount >= snack.getPrice() && snack.getQuantity() > 0) {
            System.out.println("Dispensing " + snackName);
            snack.decreaseQuantity();
        } else if (nextHandler != null) {
            nextHandler.handleRequest(snackName, amount);
        } else {
            System.out.println("Snack " + snackName + " not available or insufficient funds.");
        }
    }
}
