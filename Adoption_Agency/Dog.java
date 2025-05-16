
public class Dog {
	
	//Variables that will be passed to a Dog object
	protected int age;
	protected String name;
	protected boolean isAdopted;
	
	/**
	 * Constructor for a Dog object
	 * @param age
	 * @param name
	 * @param adopted
	 */
	public Dog(int age, String name, boolean adopted)
	{
		this.age = age;
		this.name = name;
		isAdopted = adopted;
	}
	
	/**
	 * Getter for the Dog's adoption status
	 * @return
	 */
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	
	/**
	 * States the Dog's age and name
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	/**
	 * Increases the Dog's age by 1 year
	 */
	public void increaseAge()
	{
		age++;
	}
	
	/**
	 * Overrides the original toString() method 
	 */
	public String toString()
	{
		//Applies the stateAge() method
		stateAge();
		
		//If the dog is adopted
		if (isAdopted)
		{
			//Lets the user know that the dog is adopted
			return "This dog has found a new home!";
		}
		
		//Lets the user know that the dog isn't adopted in any other case
		return "This dog is staying here!";
	}
	
	/**
	 * Overrides the original equals() method 
	 * @param dawg
	 * @return
	 */
	public boolean equals(Dog dawg)
	{
		if (this.age == dawg.age && this.name.equals(dawg.name) && this.isAdopted == dawg.isAdopted)
		{
			return true;
		}
		
		return false;
	}
}

