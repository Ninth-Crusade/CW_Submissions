
public class Locations 
{
	private String name;
	private boolean isInside;
	
	public Locations(String name, boolean isInside)
	{
		this.name = name;
		this.isInside = isInside;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public boolean isInside() 
	{
		return isInside;
	}

	public void setInside(boolean isInside)
	{
		this.isInside = isInside;
	}
}
