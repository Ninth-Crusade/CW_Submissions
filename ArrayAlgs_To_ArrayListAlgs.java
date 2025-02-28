import java.util.ArrayList;

public class Array_Algs_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(2);
		list1.add(5);
		list1.add(4);
		list1.add(4);
		list1.add(7);
		list1.add(1);
		list1.add(5);
		list1.add(9);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(8);
		list2.add(11);
		list2.add(2);
		list2.add(9);
		list2.add(27);
		list2.add(45);
		list2.add(39);
		list2.add(11);
		list2.add(17);
		list2.add(83);

		System.out.println("ArrayList: " + list1);
		System.out.println();
		
		System.out.println("Index of first '4': " + checkFor4(list1));
		
		ridAllFives(list1);
		System.out.println("ArrayList without 5's: " + list1);
		
		System.out.println();
		
		System.out.println("ArrayList 2: " + list2);
		bubbleSort(list2);
		System.out.println("Sorted Array: " + list2);
	}
	
	/*
	 * TASK 1
	 * This method checks if an array list has a '4' in it and returns the index of that '4.' If it 
	 * doesn't have a '4,' it'll return -1
	 */
	public static int checkFor4(ArrayList<Integer> arr)
	{	
		//for loop that checks every number in the array list
		for (int i = 0; i < arr.size(); i++)
		{
			//If the number the loop is checking is equal to 4
			if (i == 4)
			{
				//returns the index of the checked number if it's equal to 4
				return arr.indexOf(i);
			}
		}
		
		//returns -1 if the if statement isn't true
		return -1; 
	}
	
	/*
	 * TASK 2
	 * This method gets rid of every '5' in an array list
	 */
	public static void ridAllFives(ArrayList<Integer> arr)
	{
		//for loop that checks every number in the array list
		for (int i = 0; i < arr.size(); i++)
		{
			//If the number it's checking is 5
			if (arr.get(i) == 5)
			{
				//Removes that number because it's 5
				arr.remove(i);
				
				//Minuses one from i because the index would make the loop start on the second number
				i--;
			}
		}
	}
	
	/*
	 * TASK 3
	 * This method sorts an array list using bubble sort
	 */
	public static void bubbleSort(ArrayList<Integer> arr)
	{
		//Sets int counter to 1 so the while loop can work
		int counter = 1;
		
		//while loop that can only start when int counter is not equal to 0
		while (counter != 0)
		{
			//Sets int counter to 0 now that the loop has started
			counter = 0;
			
			//for loop that checks every number in the array list
			for (int i = 0; i < arr.size()-1; i++)
			{
				//Checks if the number the loop is checking is greater than the one after it
				if (arr.get(i) > arr.get(i+1))
				{
					//Swaps the two numbers if the above if statement is true
					int temp = arr.get(i);
					arr.set(i, arr.get(i+1));
					arr.set(i+1, temp);
					
					//Adds 1 to counter to keep track of the amount of swaps
					counter++;
				}
			}
		}
	}

}
