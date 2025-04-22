
public class Player {
	
	//Int that represents the player's row position
	private int xPos;
	
	//Int that represents the player's column position
	private int yPos;
	
	/**
	 * Method to make a Player object
	 */
	public Player()
	{
		xPos = 0;
		yPos = 0;
	}
	
	/**
	 * Getter for the player's row position
	 * @return
	 */
	public int getX() 
	{
		return xPos;
	}

	/**
	 * Setter for the player's row position
	 * @param xPos
	 */
	public void setX(int xPos) 
	{
		this.xPos = xPos;
	}

	/**
	 * Getter for the player's column position
	 * @return
	 */
	public int getY() 
	{
		return yPos;
	}

	/**
	 * Setter for the player's column position
	 * @param yPos
	 */
	public void setY(int yPos) 
	{
		this.yPos = yPos;
	}
	
}
