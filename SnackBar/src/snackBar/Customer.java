package snackBar;

public class Customer
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	// constructor
	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	// getters and setters
	public double getCash()
	{
		return cash;
	}
	public void addCash(double cash)
	{
		this.cash += cash;
	}
	public void purchaseSnack(Snack snack, int quantity)
	{
		this.cash -= snack.buySnacks(quantity);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		String rtnStr = id + name + cash;

		return rtnStr;
	}
}