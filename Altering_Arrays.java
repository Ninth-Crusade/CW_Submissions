
public class Altering_Arrays {

	public static void main(String[] args) 
	{
		int[] nums = {2, 8, 11, 5};
		subtract5FromAll4(nums);
	}
	
	public static int[] subtract5FromAll4(int [] arr)
	{
		int[] copyArr = new int[arr.length];
		
		for (int i = 0; i < copyArr.length; i++)
		{
			System.out.println(copyArr[i] = arr[i] - 5);
		}
		
		return copyArr;
	}

}
