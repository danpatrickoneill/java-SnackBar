package snackBar;

public class Snack
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// getters and setters
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public double getCost()
	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public int getVendingMachineId()
	{
		return vendingMachineId;
	}
	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
	}
	public double buySnacks(int purchaseQuantity)
	{
		quantity -= purchaseQuantity;
		return purchaseQuantity * cost;
	}
	public double getTotalCost()
	{
		return quantity * cost;
	}

	@Override
	public String toString()
	{
		String rtnStr = "Name: " + name + "Quantity: " + quantity + "Cost: " + cost + "VMId: " + vendingMachineId;

		return rtnStr;
	}
}