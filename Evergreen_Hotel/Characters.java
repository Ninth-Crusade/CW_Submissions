
public class Characters {
	
	private int age;
	private String firstName;
	private String lastName;
	private String job;
	private String height;
	private String ethnicity;
	
	public Characters(String firstName, String lastName, int age, String job, String height, String ethnicity)
	{
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.job = job;
		this.height = height;
		this.ethnicity = ethnicity;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getJob() 
	{
		return job;
	}

	public void setJob(String job) 
	{
		this.job = job;
	}

	public String getHeight() 
	{
		return height;
	}

	public void setHeight(String height) 
	{
		this.height = height;
	}
	
	public String getEthnicity() 
	{
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) 
	{
		this.ethnicity = ethnicity;
	}
	
	public String toString()
	{
		return firstName + " " + lastName + " (" + age + ", " + ethnicity + ") who works as a " + job + " and is " + height + " tall, will be staying at the Evergreen Horizon.";
	}
	
	public String dawnStalksProtag()
	{
		return "Okay then, allow me to once again welcome you to our hotel, " + firstName + " " + lastName + ", " + age + " year old " + ethnicity + " " + job + ", standing at " + height + " tall. Would you like to have the key to your room now?";
	}
	
}
