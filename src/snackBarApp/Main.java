package snackBarApp;

public class Main {
    private static void workWithData(){
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine machine1 = new VendingMachine("Food");
        VendingMachine machine2 = new VendingMachine("Drink");
        VendingMachine machine3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, machine1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.0, machine1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.0, machine1.getId());
        Snack snack4 = new Snack("Soda", 24, 2.5, machine2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, machine2.getId());


        // Customer 1 (Jane) buys 3 of snack 4 (Soda).
        //     Print Customer 1 (Jane) Cash on hand.
        //     Print quantity of snack 4 (Soda).
        customer1.buySnacks(snack4.total(3));
        snack4.purchased(3);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand() + " left. only " + snack4.getQuantity() + " " + snack4.getName() + "'s left.");
        // Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        //     Print Customer 1 (Jane) Cash on hand.
        //     Print quantity of snack 3 (Pretzel).
        customer1.buySnacks(snack3.total(1));
        snack3.purchased(1);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand() + " left. only " + snack3.getQuantity() + " " + snack3.getName() + "s left.");
        // Customer 2 (Bob) buys 2 of snack 4 (Soda).
        //     Print Customer 2 (Bob) Cash on Hand.
        //     Print quantity of snack 4 (Soda).
        customer2.buySnacks(snack4.total(2));
        snack4.purchased(2);
        System.out.println(customer2.getName() + " has $" + customer2.getCashOnHand() + " left. only " + snack4.getQuantity() + " " + snack4.getName() + "s left.");
        //  Customer 1 (Jane) finds $10.
        //     Print Customer 1 (Jane) Cash on Hand.
        customer1.addCash(10.00);
        System.out.println(customer1.getName() + " found $10.00. Now " + customer1.getName() + " has $" + customer1.getCashOnHand());
        //  Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        //     Print Customer 1 (Jane) Cash on Hand.
        //     Print quantity of snack 2 (Chocolate Bar).
        customer1.buySnacks(snack2.total(1));
        snack2.purchased(1);
        System.out.println(customer1.getName() + " has $" + customer1.getCashOnHand() + " left. only " + snack2.getQuantity() + " " + snack2.getName() + "s left.");
        // Add 12 more items to snack 3 (Pretzel).
        //     Print quantity of snack 3 (Pretzel).
        snack3.addToQuantity(12);
        System.out.println("There are " + snack3.getQuantity() + " " + snack3.getName() + "s left.");
        //  Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        //     Print Customer 2 (Bob) Cash on hand.
        //     Print quantity of snack 3 (Pretzel).
        customer2.buySnacks(snack3.total(3));
        snack3.purchased(3);
        System.out.println(customer2.getName() + " has $" + customer2.getCashOnHand() + " left. only " + snack3.getQuantity() + " " + snack3.getName() + "s left.");





    }
    public static void main (String[] args){
        workWithData();
    }
}