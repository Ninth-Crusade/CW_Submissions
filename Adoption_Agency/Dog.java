
public class Dog {
	protected int age;
	protected String name;
	protected boolean isAdopted;
	
	public Dog(int age, String name, boolean adopted)
	{
		this.age = age;
		this.name = name;
		isAdopted = adopted;
	}
	
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	public void increaseAge()
	{
		age++;
	}
	
	public String toString()
	{
		stateAge();
		if (isAdopted)
		{
			return "This dog has found a new home!";
		}
		
		return "This dog is staying here!";
	}
	
	public boolean equals(Dog dawg)
	{
		if (this.age == dawg.age && this.name.equals(dawg.name) && this.isAdopted == dawg.isAdopted)
		{
			return true;
		}
		
		return false;
	}
}
