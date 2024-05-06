// HW8
// Gabriel Bermudez
// CS4800 HW8

public class Driver {
    public static void main(String[] args) {
        Snack coke = new Snack("Coke", 1.50, 5);
        Snack pepsi = new Snack("Pepsi", 1.50, 3);
        Snack cheetos = new Snack("Cheetos", 1.25, 7);
        Snack doritos = new Snack("Doritos", 1.75, 4);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        SnackDispenseHandler cokeHandler = new ConcreteHandler(coke);
        SnackDispenseHandler pepsiHandler = new ConcreteHandler(pepsi);
        SnackDispenseHandler cheetosHandler = new ConcreteHandler(cheetos);
        SnackDispenseHandler doritosHandler = new ConcreteHandler(doritos);
        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(cheetosHandler);
        cheetosHandler.setNextHandler(doritosHandler);

        // TEST
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(1.25);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(1.75);
        vendingMachine.dispenseSnack();

        // INVALID AMOUNT TEST
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.00);
        vendingMachine.dispenseSnack();
    }
}
