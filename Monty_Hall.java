import java.util.Scanner;

public class Monty_Hall_Game {

	static Scanner myReader = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
	/*
	 * Casts the methods as ints
	 */
	int winDoor = pickRandomDoor();
	int playerDoor = pickPlayerDoor();
	int revealedDoor = showWrongDoor(playerDoor, winDoor);
	
	//Checks if the player chooses a door that isn't 1, 2, or 3
	if (playerDoor != 1 && playerDoor != 2 && playerDoor != 3)
	{
		System.out.print("That door doesn't exist. Please choose Door 1, 2, or 3.");
	}
	
	//Starts the game if the player chooses an existing door
	else
	{
		//Lets the player know which the door that they chose
		System.out.println("Your choice: Door " + playerDoor);
		
		System.out.println("You have chosen the door that either contains the money or the mountain lion. I will reveal the door with nothing behind it. (Type 'okay')");
		
		//See giveSuspense method for explanation of code
		giveSuspense(revealedDoor);
		
		//See askToSwitch method for explanation of code
		askToSwitch(winDoor, playerDoor, revealedDoor);
	}
	
	myReader.close();
	}
	
	/**
	 * This method picks the winning door by choosing a random number from 1-3 
	 * @return
	 */
	public static int pickRandomDoor()
	{
		return ((int)(Math.random()*3+1)); 
	}
	
	/**
	 * This method lets the player pick a door
	 * @return 1, 2, or 3
	 */
	public static int pickPlayerDoor()
	{
		//Introduces the scenario of the game to the player
		System.out.println("You're standing in front of three doors. One has $1M behind it, another one has a bloodthirsty mountain lion, and another has nothing.");
		System.out.println("Choose one door but don't open it: 1, 2, or 3");

		String userInput = new String (myReader.next());
		
		//Returns 1 if the player chooses Door 1
		if (userInput.equals("one") || userInput.equals("1"))
		{
			return 1;
		}
		
		//Returns 2 if the player chooses Door 2
		else if (userInput.equals("two") || userInput.equals("2"))
		{
			return 2;
		}
		
		//Returns 3 if the player chooses Door 3
		else if (userInput.equals("three") || userInput.equals("3"))
		{
			return 3;
		}
		
		return 0;
		
	}
		
	/**
	 * This method reveals a door that doesn't have the "prize" behind it
	 * @param pDoor represents playerDoor
	 * @param wDoor represents winDoor
	 * @return 
	 */
	public static int showWrongDoor(int pDoor, int wDoor)
	{
		int coinFlip = (int)(Math.random()*2);
		
		//If Door 1 is chosen
		if (pDoor == 1 && wDoor == 2)
		{
			return 3;
		}
		
		else if (pDoor == 1 && wDoor == 3)
		{ 
			return 2;
		}
		
		else if (pDoor == 1 && wDoor == 1)
		{
			return ((int)(Math.random()*2)+2);
		}
		
		//If Door 2 is chosen
		else if (pDoor == 2 && wDoor == 1)
		{
			return 3;
		}
		
		else if (pDoor == 2 && wDoor == 3)
		{
			return 1;
		}
		
		else if (pDoor == 2 && wDoor == 2)
		{
			if (coinFlip == 0)
			{
				return 1;
			}
			
			else
			{
				return 3;
			}
		}
		
		//If Door 3 is chosen
		else if (pDoor == 3 && wDoor == 1)
		{
			return 2;
		}
		
		else if (pDoor == 3 && wDoor == 2)
		{
			return 1;
		}
		
		else if (pDoor == 3 && wDoor == 3)
		{
			return ((int)(Math.random()*2)+1);
		}
		
		return 0;
	}
	

	
	/**
	 * This method was created because of an error that was showing up in the first string that was
	 * printed in the askToSwitch method. Initially, the int wDoor (winning door) was going to be 
	 * printed and ask the player if they wanted to switch to it. However, it doesn't make sense for the 
	 * game to ask the player to switch to the winning door, because it would reveal the winning door
	 * to the player. It should be revealing the remaining door that wasn't chosen yet.
	 * 
	 * This method fixes that by being returned in that string and checks every possible scenario of
	 * which door is picked by the player, which door is chosen as the wrong one, and which one is chosen
	 * as the winner. 
	 * 
	 * @param pDoor represents playerDoor
	 * @param rDoor represents revealedDoor
	 * @param wDoor represents winDoor
	 * @return
	 */
	public static int remainingDoorSwitch(int pDoor, int rDoor, int wDoor)
	{
		//If Door 1 is chosen
		if (pDoor == 1 && rDoor == 2 && wDoor == 3)
		{
			return 3;
		}
		
		else if (pDoor == 1 && rDoor == 3 && wDoor == 2)
		{
			return 2;
		}
		
		else if (pDoor == 1 && rDoor == 2 && wDoor == 1)
		{
			return 3;
		}
		
		else if (pDoor == 1 && rDoor == 3 && wDoor == 1)
		{
			return 2;
		}
		
		//If Door 2 is chosen
		else if (pDoor == 2 && rDoor == 3 && wDoor == 1)
		{
			return 1;
		}
		
		else if (pDoor == 2 && rDoor == 3 && wDoor == 2)
		{
			return 1;
		}
		
		else if (pDoor == 2 && rDoor == 1 && wDoor == 3)
		{
			return 3;
		}
		
		else if (pDoor == 2 && rDoor == 1 && wDoor == 2)
		{
			return 3;
		}
		
		//If Door 3 is chosen
		else if (pDoor == 3 && rDoor == 1 && wDoor == 2)
		{
			return 2;
		}
		
		else if (pDoor == 3 && rDoor == 1 && wDoor == 3)
		{
			return 2;
		}
		
		else if (pDoor == 3 && rDoor == 2 && wDoor == 3)
		{
			return 1;
		}
		
		else if (pDoor == 3 && rDoor == 2 && wDoor == 1)
		{
			return 1;
		}
		
		return 0;
	}
	
	/**
	 * This method is meant to separate the messages that the game gives to the player. Before, the game
	 * would let the player know which door has nothing behind it and also ask them if they wanted to 
	 * switch or stay with that door.
	 * 
	 * This method gives the player suspense by letting them not know what comes next after they are told 
	 * what door has nothing behind it, until they type something to which then they are asked to switch
	 * or stay.
	 * @param rDoor represents revealedDoor
	 */
	public static void giveSuspense(int rDoor)
	{
		String userInput = new String (myReader.next());
		{
			if (userInput.equals("okay"))
			{
				System.out.println("Door " + rDoor + " has nothing behind it.");
			}
			
			else
			{
				System.out.println("Door " + rDoor + " has nothing behind it.");
			}
		}
	}
	
	/**
	 * This method asks the player if they want to switch to the remaining door or stay with their door
	 * @param wDoor
	 * @param pDoor
	 * @param rDoor
	 */
	public static void askToSwitch(int wDoor, int pDoor, int rDoor)
	{
		//Prints the string that asks the player to switch or stay
		System.out.print("Would you like to SWITCH to Door " + remainingDoorSwitch(pDoor, rDoor, wDoor) + " or STAY with Door " + pDoor + "? You'll either get $1M or a mountain lion that will kill you. Choose wisely...");
		String userInput = new String (myReader.next());
		
		/*
		 *If the player decides to switch doors; results in a loss because the door they picked (pDoor)
		 *is the same as the door that was chosen as the winner (wDoor) 
		 */
		if (userInput.equals("switch") && wDoor == pDoor) 
		{
			System.out.print("Sorry, Door " + wDoor + " has the mountain lion, and he's looking really hungry.");
		}
		
		/*
		 * If the player decides to switch doors; results in a win because the door they picked (pDoor)
		 * is not the same as the door that was chsoen as the winner (wDoor)
		 */
		else if (userInput.equals("switch") && wDoor != pDoor)
		{
			System.out.print("Congratulations! Door " + wDoor + " has the $1M behind it. You walk out of here alive and rich!");
			//System.out.print("The mountain lion has mauled you to death. You shouldn't have switched to Door " + wDoor);
		}
		
		/*
		 * If the player decides to stay with the door they chose; results in a win because the door they
		 * picked (pDoor) is the same as the door that was chosen as the winner (wDoor)
		 */
		else if (userInput.equals("stay") && wDoor == pDoor)
		{
			System.out.print("Congratulations! Door " + pDoor + " has the $1M behind it. You walk out of here alive and rich!");
		}
		
		/*
		 * If the player decides to stay with the door they chose; results in a loss because the door they
		 * picked (pDoor) is not the same as the door that was chosen as the winner (wDoor)
		 */
		else if (userInput.equals("stay") && wDoor != pDoor)
		{
			System.out.print("Sorry, Door " + pDoor + " has the mountain lion, and he's looking really hungry...");
		}

	}

}
