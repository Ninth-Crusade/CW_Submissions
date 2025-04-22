import java.util.Scanner;

public class Main {
	
	static Scanner gameReader = new Scanner (System.in);

	public static void main(String[] args) 
	{
		//Layout of the maze in its full form; is never printed in the IDE
		String [][] solution =
		{
			{" U ", " * ", " O ", " O ", " O "},
			{" O ", " * ", " O ", " * ", " O "},
			{" O ", " O ", " O ", " * ", " O "},
			{" * ", " * ", " * ", " * ", " O "},
			{" * ", " * ", " * ", " * ", " E "}
		};
		
		/*
		 * Makes the maze out of multiple GameTile objects. Each spot is individually given its characteristics
		 */
		GameTile [][] maze = new GameTile[5][5];
		
		//Row 1
		maze[0][0] = new GameTile(true, true, false, false);
		maze[0][1] = new GameTile(false, false, true, false);
		maze[0][2] = new GameTile(false, false, false, false);
		maze[0][3] = new GameTile(false, false, false, false);
		maze[0][4] = new GameTile(false, false, false, false);
		
		//Row 2
		maze[1][0] = new GameTile(false, false, false, false);
		maze[1][1] = new GameTile(false, false, true, false);
		maze[1][2] = new GameTile(false, false, false, false);
		maze[1][3] = new GameTile(false, false, true, false);
		maze[1][4] = new GameTile(false, false, false, false);
		
		//Row 3
		maze[2][0] = new GameTile(false, false, false, false);
		maze[2][1] = new GameTile(false, false, false, false);
		maze[2][2] = new GameTile(false, false, false, false);
		maze[2][3] = new GameTile(false, false, true, false);
		maze[2][4] = new GameTile(false, false, false, false);
		
		//Row 4
		maze[3][0] = new GameTile(false, false, true, false);
		maze[3][1] = new GameTile(false, false, true, false);
		maze[3][2] = new GameTile(false, false, true, false);
		maze[3][3] = new GameTile(false, false, true, false);
		maze[3][4] = new GameTile(false, false, false, false);
		
		//Row 5
		maze[4][0] = new GameTile(false, false, true, false);
		maze[4][1] = new GameTile(false, false, true, false);
		maze[4][2] = new GameTile(false, false, true, false);
		maze[4][3] = new GameTile(false, false, true, false);
		maze[4][4] = new GameTile(false, true, false, true);
		
		//Introduces the player to the game, and gives them the meaning of the symbols
		System.out.println("CAN YOU MAKE IT THROUGH THE INVISIBLE MAZE???");
		System.out.println("U = You");
		System.out.println("* = Wall");
		System.out.println("E = Exit");
		System.out.println();
		
		//Creates the player object
		Player player = new Player();
		
		//Prints the maze
		printArr(maze);
		System.out.println();
		
		//Asks the player where they want to move
		System.out.println("Where do you want to move? Up, Down, Left, or Right?");
		
		//Calls on the method where the magic happens
		playerChoice(maze, player);
		
	}
	
	/**
	 * This method prints the 2D array, in its first stage and every time the player makes a move
	 * @param arr
	 */
	public static void printArr(GameTile[][] arr)
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
	 * This method is where the magic happens. It has the code for when the player chooses where to go; checks
	 * if that spot is open, a wall, or exists; it moves the player to a spot if it's open; etc.
	 * @param arr
	 * @param player
	 */
	public static void playerChoice(GameTile [][] arr, Player player)
	{
		String choice = gameReader.next();
				
		/*
		 * IF THE PLAYER MOVES UP
		 */
		if (choice.equals("up") || choice.equals("Up") || choice.equals("w"))
		{
			//Checks if the player goes out of bounds
			if (player.getX() <= 0)
			{
				System.out.println("You've gone too far. Try again");
				System.out.println();
			}
			
			//If the player's chosen spot is in bounds
			else
			{
				//Checks if the player's chosen spot is a wall
				if (arr[player.getX()-1][player.getY()].isWall() == true)
				{
					//Reveals the wall
					arr[player.getX()-1][player.getY()].setRevealed(true);
					
					//Informs the player that their chosen spot was a wall, and that they haven't moved
					System.out.println("That spot is a wall and you've stayed in place");
					System.out.println();
				}
				
				//Checks if the player's chosen spot is open
				else
				{
					//Reveals the player's chosen spot
					arr[player.getX()-1][player.getY()].setRevealed(true);
					
					//Makes the tile that the player was just on not have the Player object
					arr[player.getX()][player.getY()].setHasPlayer(false);
					
					//Makes the tile the player chose to move to now have the Player object
					arr[player.getX()-1][player.getY()].setHasPlayer(true);
					
					//Sets the players row position to one less
					player.setX(player.getX()-1);
					
					//Informs the player that they successfully moved to an open spot
					System.out.println("You've moved to an open spot");
					System.out.println();
				}
			}
		}
		
		/*
		 * IF THE PLAYER MOVES LEFT
		 */
		else if (choice.equals("left") || choice.equals("Left") || choice.equals("a"))
		{
			//Checks if the player goes out of bounds
			if(player.getY() <= 0)
			{
				System.out.println("You've gone too far. Try again");
				System.out.println();
			}
			
			//Checks if the player's chosen spot is in bounds
			else
			{
				//Checks if the player's chosen spot is a wall
				if (arr[player.getX()][player.getY()-1].isWall() == true)
				{
					//Reveals the wall
					arr[player.getX()][player.getY()-1].setRevealed(true);
					
					//Informs the player that their chosen spot is a wall and that they haven't moved
					System.out.println("That spot is a wall and you've stayed in place");
					System.out.println();
				}
				
				//Checks if the player's chosen spot is open
				else
				{
					//Reveals the player's chosen spot
					arr[player.getX()][player.getY()-1].setRevealed(true);
					
					//Makes the tile that the player was just on not have the Player object
					arr[player.getX()][player.getY()].setHasPlayer(false);
					
					//Makes the tile the player chose to move to now have the Player object
					arr[player.getX()][player.getY()-1].setHasPlayer(true);
					
					//Sets the player's column position to one less
					player.setY(player.getY()-1);
					
					//Informs the player that they successfully moved to an open spot
					System.out.println("You've moved to an open spot");
					System.out.println();
				}
			}
		}
		
		/*
		 * IF THE PLAYER MOVES DOWN
		 */
		else if (choice.equals("down") || choice.equals("Down") || choice.equals("s"))
		{
			//Checks if the player goes out of bounds
			if (player.getX() >= 4)
			{
				System.out.println("You've gone too far. Try again");
				System.out.println();
			}
			
			//Checks if the player's chosen spot is in bounds
			else
			{
				//Checks if the player's chosen spot is a wall
				if (arr[player.getX()+1][player.getY()].isWall() == true)
				{
					//Reveals the wall
					arr[player.getX()+1][player.getY()].setRevealed(true);
					
					//Informs the player that their chosen spot is a wall and that they haven't moved
					System.out.println("That spot is a wall and you've stayed in place");
					System.out.println();
				}
				
				//Checks if the player's chosen spot is open
				else
				{
					//Reveals the player's chosen spot
					arr[player.getX()+1][player.getY()].setRevealed(true);
					
					//Makes the tile that the player was just on not have the Player object
					arr[player.getX()][player.getY()].setHasPlayer(false);
					
					//Makes the tile the player chose to move to now have the Player object
					arr[player.getX()+1][player.getY()].setHasPlayer(true);
					
					//Sets the player's row position to one more
					player.setX(player.getX()+1);
					
					//Informs the player that they successfully moved to an open spot
					System.out.println("You've moved to an open spot");
					System.out.println();
				}
			}
		}
		
		/*
		 * IF THE PLAYER MOVES RIGHT
		 */
		else if (choice.equals("right") || choice.equals("Right") || choice.equals("d"))
		{
			//Checks if the player goes out of bounds
			if(player.getY() >= 4)
			{
				System.out.println("You've gone too far. Try again");
				System.out.println();
			}
			
			//Checks if the player's chosen spot is in bounds
			else
			{
				//Checks if the player's chosen spot is a wall
				if (arr[player.getX()][player.getY()+1].isWall() == true)
				{
					//Reveals the wall
					arr[player.getX()][player.getY()+1].setRevealed(true);
					
					//Informs the player that their chosen spot is a wall and that they haven't moved
					System.out.println("That spot is a wall and you've stayed in place");
					System.out.println();
				}
				
				//Checks if the player's chosen spot is open
				else
				{
					//Reveals the player's chosen spot
					arr[player.getX()][player.getY()+1].setRevealed(true);
					
					//Makes the tile that the player was just on not have the Player object
					arr[player.getX()][player.getY()].setHasPlayer(false);
					
					//Makes the tile the player chose to move to now have the Player object
					arr[player.getX()][player.getY()+1].setHasPlayer(true);
					
					//Sets the player's column position to one more
					player.setY(player.getY()+1);
					
					//Informs the player that they successfully moved to an open spot
					System.out.println("You've moved to an open spot");
					System.out.println();
				}
			}
		}
		
		//If the player types an invalid input when asked what direction they'd like to move in
		else
		{
			System.out.println("That is not a direction. Try again");
			System.out.println();
		}
		
		//Prints the maze after every input
		printArr(arr);
		
		System.out.println();
		
		/*
		 * IF THE PLAYER REACHES THE END OF THE MAZE
		 */
		if(player.getX() == 4 && player.getY() == 4)
		{
			System.out.println("Congratulations! You've escaped the maze!");
		}
		
		//Lets the player move again as long as the end hasn't been reached
		else
		{
			playerChoice(arr, player);
		}
		
	}

}
