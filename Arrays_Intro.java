
public class Arrays_Intro {

	public static void main(String[] args) 
	{
		//Task 1: Create arrays for doubles, ints, booleans, strings, and Circles
		double [] doubArr = {};
		int [] intArr = {};
		boolean [] boolArr = {};
		String [] strArr = {};
		//Circle [] circArr = {};
		
		//Task 2: Create an array of ints with 7, -12, 88, -88, 0, 5, 2000
		int [] numArr = {7, -12, 88, -88, 0, 5, 2000};
		System.out.println(numArr[2]);
		System.out.println(numArr[numArr.length-1]);
		
		//Task 3: Create a String array with 5 default values
		String [] fruitsArr = new String [5];
		
		//Task 4: Change the second element in the array to "bapple"
		fruitsArr[1] = "bapple";
		
		//Task 5: Change the last element in the array to "zanana"
		fruitsArr[fruitsArr.length-1] = "zanana";
		System.out.println(fruitsArr[fruitsArr.length-1]);
		
		//Task 6: Print the second element in the array, to make sure that it's "bapple"
		System.out.println(fruitsArr[1]);
		
		//Task 7: Create a loop that prints every string in the array
		System.out.println();
		for (int i = 0; i < fruitsArr.length; i++)
		{
			System.out.println(fruitsArr[i]);
		}
	}

}
