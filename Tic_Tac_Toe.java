import java.util.Scanner;

public class Tic_Tac_Toe {
	
	static Scanner gameReader = new Scanner (System.in);
	
	static boolean gameOn = true;
	
	//Keeps track of every time a move is done
	static int counter = 0;

	public static void main(String[] args) 
	{
		//The 2D array for the 3x3 grid
		String [][] grid = 
		{
			{"[ ]", "[ ]", "[ ]"},
			{"[ ]", "[ ]", "[ ]"},
			{"[ ]", "[ ]", "[ ]"},
		};
		
		//Prints the grid
		printArr(grid);
		
		System.out.println();
		
		//Welcomes the players to the game and sets the rules
		System.out.println("WELCOME TO TIC TAC TOE!!!");
		System.out.println("Player 1 is X's");
		System.out.println("Player 2 is O's");
		System.out.println();
		
		playerOneRow(grid);
		
	}
	
	/**
	 * This method prints the 2D array every time a change is made to it
	 * e.g. Player One marks an 'X'
	 * e.g. Player Two marks an 'O'
	 * @param arr
	 */
	public static void printArr(String[][] arr)
	{
		for (int i = 0; i <= arr.length-1; i++)
		{
			for (int j = 0; j <= arr[0].length-1; j++)
			{
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	/**
	 * This method is part 1 for player one's code. It lets player one input their chosen row for where they
	 * want to put 'X' in
	 * @param arr
	 */
	public static void playerOneRow(String[][] arr)
	{
		//Asks player one what row they want to put 'X' in
		System.out.print("Player 1's turn: Which row will you like to put 'X' in? ");
		
		//Opens scanner to let player one type their chosen row
		int oneRow = gameReader.nextInt();
		gameReader.nextLine();
		
		//Has the player try again if their input is invalid
		if (oneRow > 3 || oneRow < 1)
		{
			System.out.println("Invalid number. Try again");
			System.out.println();
			playerOneRow(arr);
		}
		
		//Moves on to prompting the player for the column to put 'X' in (if their input is valid)
		else
		{
			playerOneCol(arr, oneRow);
		}
		
	}
	
	/**
	 * This method is part 2 for Player One's code. It lets player one input their chosen column for where they
	 * want to put 'X' in
	 * @param arr
	 * @param oneRow
	 */
	public static void playerOneCol(String[][] arr, int oneRow)
	{
		//Asks player one what column they want to put 'X' in
		System.out.print("Player 1's turn: Which column will you like to put 'X' in? ");
		
		//Opens scanner to let player one type their chosen column
		int oneCol = gameReader.nextInt();
		gameReader.nextLine();
		
		//Has the player try again if their input is invalid
		if (oneCol > 3 || oneCol < 1)
		{
			System.out.println("Invalid number. Try again");
			System.out.println();
			playerOneCol(arr, oneRow);
		}
		
		//Lets the player try again if their chosen spot is already taken
		else if(arr[oneRow-1][oneCol-1] == " O " || arr[oneRow-1][oneCol-1] == " X ")
		{
			System.out.println("That spot is already taken. Try again ");
			System.out.println();
			playerOneRow(arr);
		}
		
		//If the player's input is valid
		else
		{
			//Adds to the counter that keeps track of how many moves have been made in the game
			counter++;
			
			//Sets Player One's chosen spot to 'X', taking into account their previous inputs 
			arr[oneRow-1][oneCol-1] = " X ";
		
			System.out.println();
		
			//Prints the 3x3 grid, with the chosen spot now revealing an 'X'
			printArr(arr);
		
			System.out.println();
		
			//Checks if the game is over. If not, it moves on to Player Two's turn
			if (!gameOver(arr))
			{
				playerTwoRow(arr);
			}
		}
	}
	
	/**
	 * This method is part 1 for player two's code. It lets player one input their chosen row for where they
	 * want to put 'X' in
	 * @param arr
	 */
	public static void playerTwoRow(String[][] arr)
	{
		System.out.print("Player 2's turn: Which row will you like to put 'O' in? ");
		int twoRow = gameReader.nextInt();
		gameReader.nextLine();
		
		//Has the player try again if their input is invalid
		if (twoRow > 3 || twoRow < 1)
		{
			System.out.println("Invalid number. Try again");
			System.out.println();
			playerTwoRow(arr);
		}
		
		//Moves on to prompting Player Two for what column they want to put 'O' in (if their input is valid)
		else
		{
			playerTwoCol(arr, twoRow);
		}
		
	}
	
	/**
	 * This method is part 2 for Player Two's code. It lets player one input their chosen column for where they
	 * want to put 'O' in
	 * @param arr
	 * @param oneRow
	 */
	public static void playerTwoCol(String[][] arr, int twoRow)
	{
		System.out.print("Player 2's turn: Which column will you like to put 'O' in? ");
		int twoCol = gameReader.nextInt();
		gameReader.nextLine();
		
		//Has the player try again if their input is invalid
		if (twoCol > 3 || twoCol < 1)
		{
			System.out.println("Invalid number. Try again");
			System.out.println();
			playerTwoCol(arr, twoRow);
		}
		
		//Lets the player try again if their chosen spot is already taken
		else if(arr[twoRow-1][twoCol-1] == " O " || arr[twoRow-1][twoCol-1] == " X ")
		{
			System.out.println("That spot is already taken. Try again ");
			System.out.println();
			playerTwoRow(arr);
		}
		
		//If the player's input is valid
		else
		{
			//Adds to the counter that keeps track of how many moves have been made in the game
			counter++;
			
			//Sets Player Two's chosen spot to 'O', taking into account their previous inputs 
			arr[twoRow-1][twoCol-1] = " O ";
		
			System.out.println();
		
			//Prints the 3x3 grid, with the chosen spot now revealing an 'O'
			printArr(arr);
		
			System.out.println();
		
			//Checks if the game is over. If not, it goes back to Player One's turn
			if(!gameOver(arr))
			{
				playerOneRow(arr);
			}
		}
		
	}
	
	/**
	 * This method checks if the game is over
	 * @param arr
	 * @return
	 */
	public static boolean gameOver(String[][] arr)
	{
		/*
		 * VERTICAL THREE IN A ROW
		 */
		for (int i = 0; i < arr.length; i++)
		{
			//Player 1 wins
			if (arr[0][i] == " X " && arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i])
			{
				System.out.println("Player 1 wins!!!");
				return true;
			}
			
			//Player 2 wins
			else if (arr[0][i] == " O " && arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i])
			{
				System.out.println("Player 2 wins!!!");
				return true;
			}
			
		}
		
		/*
		 * HORIZONTAL THREE IN A ROW
		 */
		for (int i = 0; i < arr[0].length; i++)
		{
			//Player 1 wins
			if (arr[i][0] == " X " && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])
			{
				System.out.println("Player 1 wins!!!");
				return true;
			}
			
			//Player 2 wins
			else if (arr[i][0] == " O " && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])
			{
				System.out.println("Player 2 wins!!!");
				return true;
			}
		}
		
		/*
		 * POSITIVE SLOPED DIAGONAL THREE IN A ROW
		 */
			
		//Player 1 wins
		if (arr[2][0] == " X " && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])
		{
			System.out.println("Player 1 wins!!!");
			return true;
		}
		
		//Player 2 wins
		else if (arr[2][0] == " O " && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])
		{
			System.out.println("Player 2 wins!!!");
			return true;
		}
		
		/*
		 * NEGATIVE SLOPED DIAGONAL THREE IN A ROW
		 */
		
		//Player 1 wins
		else if (arr[0][0] == " X " && arr[0][0] == arr [1][1] && arr[1][1] == arr[2][2])
		{
			System.out.println("Player 1 wins!!!");
			return true;
		}
		
		//Player 2 wins
		else if (arr[0][0] == " O " && arr[0][0] == arr [1][1] && arr[1][1] == arr[2][2])
		{
			System.out.println("Player 2 wins!!!");
			return true;
		}
		
		/*
		 * IF GAME ENDS IN A TIE
		 */
		//If the counter variable is equal to 9, it means that there have been 9 moves made and there's no
		//three in a row, resulting in a tie
		else if (counter == 9)
		{
			System.out.println("It's a tie! You both suck!");
			return true;
		}
		
		return false;
	}
	
}
