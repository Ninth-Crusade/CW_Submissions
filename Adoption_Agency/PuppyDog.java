
public class PuppyDog extends Dog{
	protected boolean isFed;
	
	public PuppyDog(int age, String name, boolean adopted, boolean fed)
	{
		super(age, name, adopted);
		isFed = fed;
	}
	
	public void stateAge()
	{
		System.out.println(name + " is " + age + " months old.");
	}
	
	public void feedPuppy()
	{
		isFed = true;
	}
	
	public void increaseAge()
	{
		super.increaseAge();
		isFed = false;
	}
	
	public String puppyToString()
	{
		super.toString();
		
		if(isFed)
		{
			return super.toString() + " This pup has been fed!";
		}
		
		return super.toString() + " This pup is starving";
	}
	
	public boolean equals(PuppyDog lilDawg)
	{
		if (super.equals(lilDawg) && this.isFed == lilDawg.isFed)
		{
			return true;
		}
		
		return false;
	}
}
