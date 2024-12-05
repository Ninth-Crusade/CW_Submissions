
//This method gives you a month of the year that corresponds with a number 1-12
public static String getMonth(int n)
	{
		//This instantiates the months of the year and declares them as a string
		String months = "January February March April May June "
				+ "July August September October November December ";

		//This loop starts at 1, and then keeps on adding to it and stop when the value is greater than 12
		for (int i = 1; i <= 12; i++)
		{
			//Declares an int of the space before a month from the string
			int sL = months.indexOf(' ');

			//If the original number is equal to i after i's value keeps on increasing by one
			if (n == i)
			{
        		//Returns the month's name 
				return months.substring(0, sL);
			}
      
			//Continues to add if n != i
			else
			{
        		/*
        		 * Cuts off the month whose number (i) isn't equal to the original number (n) from the
        		 * string and moves on to the next month
        		 */
				months = months.substring(sL + 1);
			}
		}
		
		//If the number entered isn't 1-12
		return "invalid month number";

	}
}
