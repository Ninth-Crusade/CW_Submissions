
public class GameTile {
	
	//Boolean to say whether a tile has the player on it
	private boolean hasPlayer;
	
	//Boolean to say whether a tile is revealed
	private boolean isRevealed;
	
	//Boolean to say if a tile is a wall
	private boolean isWall;
	
	//Boolean to say if the tile is the end point
	private boolean isEnd;
	
	/**
	 * Method that makes a GameTile object, that is passed all the booleans listed
	 * @param player
	 * @param revealed
	 * @param wall
	 * @param end
	 */
	public GameTile(boolean player, boolean revealed, boolean wall, boolean end)
	{
		hasPlayer = player;
		isRevealed = revealed;
		isWall = wall;
		isEnd = end;
	}
	
	/**
	 * Getter for if a GameTile has the Player object
	 * @return
	 */
	public boolean isHasPlayer() 
	{
		return hasPlayer;
	}

	/**
	 * Setter for if a GameTile has the Player object
	 * @param hasPlayer
	 */
	public void setHasPlayer(boolean hasPlayer) 
	{
		this.hasPlayer = hasPlayer;
	}

	/**
	 * Getter for if a GameTile is revealed to the player
	 * @return
	 */
	public boolean isRevealed() 
	{
		return isRevealed;
	}

	/**
	 * Setter for if a GameTile is revealed to the player
	 * @param isRevealed
	 */
	public void setRevealed(boolean isRevealed) 
	{
		this.isRevealed = isRevealed;
	}

	/**
	 * Getter for if a GameTile is a wall
	 * @return
	 */
	public boolean isWall() 
	{
		return isWall;
	}

	/**
	 * Setter for if a GameTile is a wall
	 * @param isWall
	 */
	public void setWall(boolean isWall) 
	{
		this.isWall = isWall;
	}

	/**
	 * Getter for if a GameTile is the end point
	 * @return
	 */
	public boolean isEnd() 
	{
		return isEnd;
	}

	/**
	 * Setter for if a GameTile is the end point
	 * @param isEnd
	 */
	public void setEnd(boolean isEnd) 
	{
		this.isEnd = isEnd;
	}

	/**
	 * Method that returns the symbols for every GameTile in the maze. Symbols change throughout the game.
	 */
	public String toString()
	{
		//If a tile has the player on it
		if (hasPlayer == true)
		{
			return " U ";
		}
		
		//If a tile is the end point
		if (isEnd == true)
		{
			return " E ";
		}
		
		//If the tile isn't revealed; shows the default symbol 
		if (isRevealed == false)
		{
			return "[ ]";
		}
		
		//If the tile is revealed
		else if (isRevealed == true)
		{
			//Shows the symbol for a wall if that tile is a wall
			if (isWall == true)
			{
				return " * ";
			}
			
			//Shows the symbol for an open spot if that tile isn't a wall
			else if (isWall == false)
			{
				return " O ";
			}
		}
		
		//Returns a symbol that isn't used in the game if everything else isn't true. 'A' should never be returned
		return " A ";
		
	}
}
