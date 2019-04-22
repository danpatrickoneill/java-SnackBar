package snackBar;

public class VirtualMachineError{

	private static void workWithData ()
	{
		Customer jane = new Customer("Jane", 45.25)
		Customer bob = new Customer("Bob", 33.14)

		VendingMachine vmFood = new VendingMachine("Food")
		VendingMachine vmDrink = new VendingMachine("Drink")
		VendingMachine vmOffice = new VendingMachine("Office")

		// Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 36, 1.75, vmFood.getId())
		Snack choco = new Snack("Chocolate Bar", 36, 1.00, vmFood.getId())
		Snack pretzel = new Snack("Pretzel", 30, 2.00, vmFood.getId())
		Snack soda = new Snack("Soda", 24, 2.50, vmDrink.getId())
		Snack water = new Snack("Chips", 20, 2.75, vmDrink.getId())
	}
}