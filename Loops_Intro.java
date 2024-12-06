
public class Loops_Intro {

	public static void main(String[] args) {
		
		//Task 1: Count how many times a certain letter appears in a string
		System.out.println(countLetters("fqeiosdhfquaqnvakl", 'q'));
		
		//Task 2: Calculates the factorial of a number
		int num = 5;
		System.out.println(getFactorial(num));
		
		//Task 3: Returns true if there are two letters next to each other in a string
		String str = new String ("aabce");
		System.out.print(getIfRepeats(str));

	}
	
	/*
	 * Method for Task 1
	 */
	public static int countLetters(String str, char let)
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
	
	/*
	 * Method for Task 2
	 */
	public static int getFactorial(int n)
	{
		System.out.println("");
		
		//Variable that represents the chosen number
		int prod = n;
		
		/*
		 * Starts at the number that is one less than the chosen number, then keeps subtracting from
		 * it as long as the number is greater than 1 
		 */
		for(int i = n-1; i>0; i--)
		{
			/*
			 * Multiplies the chosen number by its value minus 1; if this wasn't here, the number will 
			 * get multiplied by itself, and then decrease
			 * Example: 5*5*4*3*2*1 INCORRECT
			 */
			prod = prod*(n-1);
			n--;
		}
		
		return prod;
	}
	
	/*
	 * Method for Task 3
	 */
	public static boolean getIfRepeats(String str)
	{
		System.out.println("");
		
		//Keeps increasing in number for the string, checking every letter until it reaches the second to last letter
		for (int i = 0; i<str.length()-1; i++)
		{
			//Checks if the letter is the same as the one next to it; checks every letter because of the for loop
			if (str.charAt(i) == str.charAt(i + 1))
			{
				return true;
			}
			
		}
		
		//Returns false if there are no letters next to each other in the string
		return false;
	}

}
