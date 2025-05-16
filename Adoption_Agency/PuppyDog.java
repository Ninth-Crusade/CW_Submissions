
//Includes the characteristics of the Dog class
public class PuppyDog extends Dog{
	
	//Makes a new boolean that isn't apart of the Dog class
	protected boolean isFed;
	
	/**
	 * Constructor for a PuppyDog object
	 * @param age
	 * @param name
	 * @param adopted
	 * @param fed
	 */
	public PuppyDog(int age, String name, boolean adopted, boolean fed)
	{
		//Includes the attributes given to a Dog object
		super(age, name, adopted);
		
		//Puts in the new attribute that is exclusive to this class
		isFed = fed;
	}
	
	/**
	 * States the age for the Puppy, this time in months instead of years
	 */
	public void stateAge()
	{
		System.out.println(name + " is " + age + " months old.");
	}
	
	/**
	 * Feeds the Puppy, making isFed be true
	 */
	public void feedPuppy()
	{
		isFed = true;
	}
	
	/**
	 * Increases the age of the Puppy
	 */
	public void increaseAge()
	{
		//Includes the increaseAge() method that was created in the Dog class
		super.increaseAge();
		isFed = false;
	}
	
	/**
	 * Makes a toString() method for the Puppy class
	 * @return
	 */
	public String puppyToString()
	{
		//Includes the toString() method from the Dog class
 		super.toString();
		
		//If the Puppy has been fed
 		if(isFed)
		{
			return super.toString() + " This pup has been fed!";
		}
		
		//If the Puppy hasn't been fed
 		return super.toString() + " This pup is starving";
	}
	
	/**
	 * equals() method for the Puppy class
	 * @param lilDawg
	 * @return
	 */
	public boolean equals(PuppyDog lilDawg)
	{
		//Includes the equals() method made in the Dog class. Checks if the Puppy is true with the equals() method
		//and includes if it is equal in the isFed method as well
		if (super.equals(lilDawg) && this.isFed == lilDawg.isFed)
		{
			return true;
		}
		
		//Returns false otherwise
		return false;
	}
}
