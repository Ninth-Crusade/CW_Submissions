import java.util.Scanner;

public class Test {
	
	static Scanner gameReader = new Scanner (System.in);
	static Characters christian = new Characters ("Christian", "Shaft", 24, "detective", "6'2''", "Black");
	static Characters mia = new Characters ("Mia", "Woods", 25, "lawyer", "5'7''", "White");
	static Characters emmett = new Characters ("Emmett", "Shaft", 27, "lawyer", "5'10''", "Black");
	static Characters dawn = new Characters ("Dawn", "Evergreen", 55, "receptionist", "5'8''", "Norwegian American");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void hackDawnsComputer(Characters protag)
	{
		String goToComputer = gameReader.next();
		
		if (goToComputer.equals("1"))
		{
			System.out.println("You and " + christian.getFirstName() + " sneak to the front desk while no one is looking and find " + dawn.getFirstName() + "'s computer, but you need a password to get in.");
			System.out.println("1. How are we supposed to get in?");
			System.out.println("2. Well, it was worth a shot");
			
			String decideToHack = gameReader.next();
			
			if (decideToHack.equals("1"))
			{
				System.out.println(christian.getFirstName() + ": Don't worry, I got a plan.");
			}
			
			else if (decideToHack.equals("2"))
			{
				System.out.println(christian.getFirstName() + ": C'mon don't have that attitude, " + protag.getFirstName() + ". I've got a plan");
			}
			
			System.out.println("You: What is it?");
			System.out.println(christian.getFirstName() + ": A few months back in San Diego, my precinct was hit by a cyber attack. So in order to fight the hacker, we brought in a hacker ourselves. The guy was so good "
					+ "that he ended up working for us, and he's shown me some stuff.");
			System.out.println(christian.getFirstName() + " started pressing some keys and then a black screen with white text appeared on the computer.");
			System.out.println();
			System.out.println("XXcdXfXhXjkXmnopqXstuvwxyz");
			System.out.print(christian.getFirstName() + ": There are ");
			System.out.print(hackerChart("XXcdXfXhXjkXmnopqXstuvwxyz", 'X'));
			System.out.println(" X's in this jumble of letters. Do you notice anything?");
			System.out.println("1. Yes, I do");
			System.out.println("2. No, I don't see anything");
			
			String whatsInTheJumble = gameReader.next();
			
			if (whatsInTheJumble.equals("1"))
			{
				System.out.println(christian.getFirstName() + ": Exactly! These letters represent the alphabet, and the X's represent the missing letters!");
			}
			
			else if (whatsInTheJumble.equals("2"))
			{
				System.out.println(christian.getFirstName() + ": It's alright, I'll tell you. These letters represent the alphabet, and the X's represent the missing letters!");
			}
			
			System.out.println("a b e g i l r");
			System.out.println(christian.getFirstName() + ": These letters spell out a name, which is the password that " + dawn.getFirstName() + " set for this computer. Try guessing it.");
			hackingIntoComputer(protag);
			
		}
	}
	
	public static int hackerChart(String str, char let)
	{
		//Variable that shows the number of times the selected letter shows up in the string
		int count = 0;
		
		//Keeps adding 1 to i until it reaches the last character of the string
		for (int i = 0; i<str.length(); i++)
		{
			//Checks if the chosen letter is the same character as i, and then adds 1 to count if true
			if (let == str.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
	
	public static void hackingIntoComputer(Characters protag)
	{
		boolean hack = true;
		int count = 0;
		String password = "gabriel";
		while (hack)
		{
			String passwordGuess = gameReader.next();
			
			if (passwordGuess.equals("gabriel"))
			{
				System.out.println("Nice job, " + protag.getFirstName() + "! The password was '" + password + "'");
			}
			
			else
			{
				System.out.println(christian.getFirstName() + ": Try another combination, " + protag.getFirstName());
			}
		}
	}

}
