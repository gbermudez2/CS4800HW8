// HW8
// Gabriel Bermudez
// CS4800 HW8

public abstract class SnackDispenseHandler {
    protected SnackDispenseHandler nextHandler;

    public void setNextHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String snackName, double amount);
}
