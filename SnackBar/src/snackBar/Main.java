package snackBar;

public class Main{

	private static void workWithData ()
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine vmFood = new VendingMachine("Food");
		VendingMachine vmDrink = new VendingMachine("Drink");
		VendingMachine vmOffice = new VendingMachine("Office");

		// Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 36, 1.75, vmFood.getId());
		Snack choco = new Snack("Chocolate Bar", 36, 1.00, vmFood.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, vmFood.getId());
		Snack soda = new Snack("Soda", 24, 2.50, vmDrink.getId());
		Snack water = new Snack("Chips", 20, 2.75, vmDrink.getId());


		// Let's see some data
		System.out.println("*** Query Data");

		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());
		System.out.printf("There are %d %ss left%n", soda.getQuantity(), soda.getName());
		System.out.println(jane.purchaseSnack(soda, 3));
		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());
		System.out.printf("There are %d %ss left%n", soda.getQuantity(), soda.getName());

		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());
		System.out.printf("There are %d %ss left%n", pretzel.getQuantity(), pretzel.getName());
		System.out.println(jane.purchaseSnack(pretzel, 1));
		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());
		System.out.printf("There are %d %ss left%n", pretzel.getQuantity(), pretzel.getName());

		System.out.printf("%s has $%.2f%n", bob.getName(), bob.getCash());
		System.out.printf("There are %d %ss left%n", soda.getQuantity(), soda.getName());
		System.out.println(bob.purchaseSnack(soda, 2));
		System.out.printf("%s has $%.2f%n", bob.getName(), bob.getCash());
		System.out.printf("There are %d %ss left%n", soda.getQuantity(), soda.getName());

		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());
		jane.addCash(10.00);
		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());

		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());
		System.out.printf("There are %d %ss left%n", choco.getQuantity(), choco.getName());
		System.out.println(jane.purchaseSnack(choco, 1));
		System.out.printf("%s has $%.2f%n", jane.getName(), jane.getCash());
		System.out.printf("There are %d %ss left%n", choco.getQuantity(), choco.getName());

		System.out.printf("There are %d %ss left%n", pretzel.getQuantity(), pretzel.getName());
		pretzel.addQuantity(12);
		System.out.printf("There are %d %ss left%n", pretzel.getQuantity(), pretzel.getName());

		System.out.printf("%s has $%.2f%n", bob.getName(), bob.getCash());
		System.out.printf("There are %d %ss left%n", pretzel.getQuantity(), pretzel.getName());
		System.out.println(bob.purchaseSnack(pretzel, 3));
		System.out.printf("%s has $%.2f%n", bob.getName(), bob.getCash());
		System.out.printf("There are %d %ss left%n", pretzel.getQuantity(), pretzel.getName());

		System.out.println(chips.getName());
		System.out.println(chips.getVendingMachineId());
		System.out.println(chips.getQuantity());
		System.out.println(chips.getTotalCost());


	}

	public static void main(String[] args)
	{
		workWithData();

	}
}