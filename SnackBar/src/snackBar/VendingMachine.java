package snackBar;

public class VendingMachine
{
	// fields
	private static int maxId = 0;
	private int id;
	private String name;

	// constructor
	public VendingMachine(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
	}

	// methods
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
	
		@Override
	public String toString()
	{
		String rtnStr = id + name;

		return rtnStr;
	}
}