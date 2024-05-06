// HW8
// Gabriel Bermudez
// CS4800 HW8

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private StateOfVendingMachine currentState;
    private StateOfVendingMachine idleState;
    private StateOfVendingMachine waitingForMoneyState;
    private StateOfVendingMachine dispensingState;

    private String selectedSnack;
    private Map<String, Snack> snacks;

    public VendingMachine() {
        idleState = new IdleState(this);
        waitingForMoneyState = new WaitingForMoneyState(this);
        dispensingState = new DispensingState(this);
        currentState = idleState;
        snacks = new HashMap<>();
    }

    public void setCurrentState(StateOfVendingMachine currentState) {
        this.currentState = currentState;
    }

    public StateOfVendingMachine getIdleState() {
        return idleState;
    }

    public StateOfVendingMachine getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public StateOfVendingMachine getDispensingState() {
        return dispensingState;
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(snackName);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack();
    }

    public void addSnack(Snack snack) {
        snacks.put(snack.getName(), snack);
    }

    public double getSnackPrice(String snackName) {
        return snacks.get(snackName).getPrice();
    }

    public Snack getSnack(String snackName) {
        return snacks.get(snackName);
    }

    public String getSelectedSnack() {
        return selectedSnack;
    }

    public void setSelectedSnack(String selectedSnack) {
        this.selectedSnack = selectedSnack;
    }
}
