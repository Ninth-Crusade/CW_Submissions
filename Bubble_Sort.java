public class Bubble_Sort {

	public static void main(String[] args) 
	{
		int [] myArray = {2, 7, 4, 1, 13, 20, 9, 6, 15, 17, 3};
		
		bubbleSort(myArray);
		
		for (int i = 0; i < myArray.length; i++)
		{
			System.out.println((myArray[i]));
		}
	}
	
	public static int [] bubbleSort(int [] nums)
	{
		int counter = 1;
		
		while (counter != 0)
		{
			counter = 0;
			for (int i = 0; i < nums.length-1; i++)
			{
				if (nums[i] > nums[i+1])
				{
					int temp = nums[i];
					nums [i] = nums[i+1];
					nums[i+1] = temp;
					counter++;
				}
				
			}
			
		}
		
		return nums;
	}

}
