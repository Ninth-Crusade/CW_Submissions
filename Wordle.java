import java.util.Scanner;
public class Wordle_Game_Backup {

	static Scanner gameReader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		//The solution to the Wordle
		String solution = new String ("thick");
		
		System.out.print("Welcome to Wordle! ");
		
		//This code runs the game by calling the methods that were made below
		startGame();
		playerGuess(solution);

	}

	//This method gives the player the player the rules of the game
	private static void startGame() {
		System.out.println("Make a guess (lowercase and no repeating letters please)");
		System.out.println("e.g. 'POINT', 'apple', 'CruSt', 'soils' INVALID ANSWERS");
		
	}
	
	/*
	 * This method lets the player know if they have made errors in their guess that violate the rules 
	 * of the game
	 */
	private static String playerErrors()
	{
		String wrongGuess = new String (gameReader.next());
		
		//If the player guesses a word that is too long or too short
		if (wrongGuess.length() != 5)
		{
			System.out.println("Please guess a word with five letters");
		}
		
		/*
		 * If the player guesses a word where the same letter appears more than once
		 */
		else if (wrongGuess.charAt(0) == wrongGuess.charAt(1) || wrongGuess.charAt(0) == wrongGuess.charAt(2) || wrongGuess.charAt(0) == wrongGuess.charAt(3) || wrongGuess.charAt(0) == wrongGuess.charAt(4))
		{
			System.out.println("That word has repeating letters. Try another word");
		}
		
		else if (wrongGuess.charAt(1) == wrongGuess.charAt(2) || wrongGuess.charAt(1) == wrongGuess.charAt(3) || wrongGuess.charAt(1) == wrongGuess.charAt(4))
		{
			System.out.println("That word has repeating letters. Try another word");
		}
		
		else if (wrongGuess.charAt(2) == wrongGuess.charAt(3) || wrongGuess.charAt(2) == wrongGuess.charAt(4))
		{
			System.out.println("That word has repeating letters. Try another word");
		}
		
		else if (wrongGuess.charAt(3) == wrongGuess.charAt(4))
		{
			System.out.println("That word has repeating letters. Try another word");
		}
		
		return wrongGuess;
	}
	
	private static void playerGuess(String soln)
	{
		String guess = playerErrors();
		
		/*
		 * Checks if the first letter of the player's guess is the same as the first letter of 
		 * the solution
		 */
		if (guess.charAt(0) == soln.charAt(0))
		{
			System.out.print(soln.charAt(0));
		}
		
		/*
		 * Checks if the first letter of the solution is anywhere in the player's guess besides the
		 * first spot
		 */
		else if (guess.charAt(0) == soln.charAt(1) || guess.charAt(0) == soln.charAt(2) || guess.charAt(0) == soln.charAt(3) || guess.charAt(0) == soln.charAt(4))
		{
			System.out.print("?");
		}
		
		/*
		* Checks if the first letter in the player's guess is not the same as the first letter of the
		* solution
		*/ 
		else if (guess.charAt(0) != soln.charAt(0))
		{
			System.out.print("X");
		}
		
		/*
		 * Checks if the second letter of the player's guess is the same as the second letter of 
		 * the solution
		 */
		if (guess.charAt(1) == soln.charAt(1))
		{
			System.out.print(soln.charAt(1));
		}
		
		/*
		 * Checks if the second letter of the solution is anywhere in the player's guess besides the
		 * second spot
		 */
		else if (guess.charAt(1) == soln.charAt(0) || guess.charAt(1) == soln.charAt(2) || guess.charAt(1) == soln.charAt(3) || guess.charAt(1) == soln.charAt(4))
		{
			System.out.print("?");
		}
		
		/*
		* Checks if the second letter in the player's guess is not the same as the second letter of the
		* solution
		*/ 
		else if (guess.charAt(1) != soln.charAt(1))
		{
			System.out.print("X");
		}
		
		/*
		 * Checks if the third letter of the player's guess is the same as the third letter of 
		 * the solution
		 */
		if (guess.charAt(2) == soln.charAt(2))
		{
			System.out.print(soln.charAt(2));
		}
		
		/*
		 * Checks if the first letter of the solution is anywhere in the player's guess besides the
		 * first spot
		 */
		else if (guess.charAt(2) == soln.charAt(0) || guess.charAt(2) == soln.charAt(1) || guess.charAt(2) == soln.charAt(3) || guess.charAt(2) == soln.charAt(4))
		{
			System.out.print("?");
		}
		
		/*
		* Checks if the third letter in the player's guess is not the same as the third letter of the
		* solution
		*/ 
		else if (guess.charAt(2) != soln.charAt(2))
		{
			System.out.print("X");
		}
		
		/*
		 * Checks if the fourth letter of the player's guess is the same as the fourth letter of 
		 * the solution
		 */
		if (guess.charAt(3) == soln.charAt(3))
		{
			System.out.print(soln.charAt(3));
		}
		
		/*
		 * Checks if the first letter of the solution is anywhere in the player's guess besides the
		 * first spot
		 */
		else if (guess.charAt(3) == guess.charAt(0) || guess.charAt(3) == guess.charAt(1) || guess.charAt(3) == guess.charAt(2) || guess.charAt(3) == guess.charAt(4))
		{
			System.out.print("?");
		}
		
		/*
		* Checks if the fourth letter in the player's guess is not the same as the fourth letter of the
		* solution
		*/ 
		else if (guess.charAt(3) != soln.charAt(3))
		{
			System.out.print("X");
		}
		
		/*
		 * Checks if the fifth letter of the player's guess is the same as the fifth letter of 
		 * the solution
		 */
		if (guess.charAt(4) == soln.charAt(4))
		{
			System.out.print(soln.charAt(4));
		}
		
		/*
		 * Checks if the first letter of the solution is anywhere in the player's guess besides the
		 * first spot
		 */
		else if (guess.charAt(4) == soln.charAt(0) || guess.charAt(4) == soln.charAt(1) || guess.charAt(4) == soln.charAt(2) || guess.charAt(4) == soln.charAt(3))
		{
			System.out.print("?");
		}
		
		/*
		* Checks if the fifth letter in the player's guess is not the same as the fifth letter of the
		* solution
		*/ 
		else if (guess.charAt(4) != soln.charAt(4))
		{
			System.out.println("X");
		}
		
		
		/*
		 * Checks if the guess is right or wrong
		 */
		
		//Used for spacing
		System.out.println("");
		
		/*
		 * Lets the player know they've won
		 */
		if (guess.charAt(0) == soln.charAt(0) && guess.charAt(1) == soln.charAt(1) && guess.charAt(2) == soln.charAt(2) && guess.charAt(3) == soln.charAt(3) && guess.charAt(4) == soln.charAt(4))
		{
			System.out.print("Congratulations! You've successfully guessed that the word was " + soln);
		}
		
		/*
		 * Lets the player try again if their guess was wrong
		 */
		else
		{
			playerGuess(soln);
		}
		
		
	}

}
