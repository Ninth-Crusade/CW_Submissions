/**
	 * This method is not static. What does this mean about how the method works? After code tracing, 
	 * also answer the following question: what does this method do?
	 * 
	 * This method being non static means that it relies on an object. This method checks if a chosen
	 * letter is in a string. If it is, the method will return the index of that chosen letter, and 
	 * will return -1 if that letter isn't in the string at all
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * 
		 * 
		 */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * If the letter that is chosen isn't in the string, then its index doesn't exist.
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
			 * Checks if c is in str, and returns the index of where it's at.
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
		 * Returns -1 if a letter didn't show up
		 */
		return -1;
		
	}
