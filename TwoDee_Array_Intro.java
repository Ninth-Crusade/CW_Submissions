
public class TwoDee_Array_Intro {

	public static void main(String[] args) 
	{
		int [][] grid = new int [4][6];
		
		int [][] newGrid = 
		{
			{4, 5, 7},
			{2, -1, 8},
			{0, 1, 3}
		};
		
		int [][] newGridTwo = 
		{
			{4, 1, 0, 5, 2},
			{6, 9, 9, 3, 7},
			{8, 5, 9, 2, 5}
		};
		
		printArr(grid);
		
		System.out.println();
		
		printArr(newGrid);
		
		System.out.println();
		
		/*
		 * TASK 3
		 */
		System.out.println("TASK 3: CHANGE THE FIRST ELEMENT IN THE FIRST ROW, FIRST COLUMN TO 17");
		
		//Changes the element to 17
		grid[0][0] = 17;
		newGrid[0][0] = 17;
		
		//Prints out the transformed arrays
		printArr(grid);
		System.out.println();
		printArr(newGrid);
		
		//Used for spacing
		System.out.println();
		
		/*
		 * TASK 4
		 */
		System.out.println("TASK 4: CHANGE THE ELEMENT IN THE SECOND ROW, THIRD COLUMN TO 20");
		
		//Changes the element to 20
		grid[1][2] = 20;
		newGrid[1][2] = 20;
		
		//Prints out the transformed arrays
		printArr(grid);
		System.out.println();
		printArr(newGrid);
		
		//Used for spacing
		System.out.println();
		
		/*
		 * Task 5
		 */
		System.out.println("TASK 5: CHANGE THE LAST ELEMENT IN THE FIRST ROW TO -5"); 
		
		//Changes the element to -5
		grid[0][grid[0].length-1] = -5;
		newGrid[0][newGrid[0].length-1] = -5;
		
		//Prints out the transformed arrays
		printArr(grid);
		System.out.println();
		printArr(newGrid);
		
		//Used for spacing
		System.out.println();
		
		/*
		 * Task 6
		 */
		System.out.println("TASK 6: CHANGE THE FIRST ELEMENT IN THE LAST ROW TO -7");
		
		//Changes the element to -7
		grid[grid.length-1][0] = -7;
		newGrid[newGrid.length-1][0] = -7;
		
		//Prints out the transformed arrays
		printArr(grid);
		System.out.println();
		printArr(newGrid);
		
		//Used for spacing
		System.out.println();
		
		/*
		 * Task 7
		 */
		System.out.println("TASK 7: CHANGE THE LAST ELEMENT IN THE LAST ROW TO -30");
		
		//Changes the element to -30
		grid[grid.length-1][grid[0].length-1] = -30;
		newGrid[newGrid.length-1][newGrid[0].length-1] = -30;
		
		//Prints out the transformed arrays
		printArr(grid);
		System.out.println();
		printArr(newGrid);
		
		//Used for spacing
		System.out.println();
		
		/*
		 * Demonstrates Task 8
		 */
		System.out.println("TASK 8: MAKE A METHOD THAT PRINTS OUT AN ARRAY'S FIRST ROW");
		firstRow(newGridTwo);
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * Demonstrates Task 9
		 */
		System.out.println("TASK 9: MAKE A METHOD THAT PRINTS OUT AN ARRAY'S FIRST COLUMN");
		firstColumn(newGridTwo);
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * Demonstrates Task 10
		 */
		System.out.println("TASK 10: MAKE A METHOD THAT PRINTS OUT AN ARRAY IN ROW-MAJOR ORDER");
		rowMajor(newGridTwo);
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * Demonstrates Task 11
		 */
		System.out.println("TASK 11: MAKE A METHOD THAT PRINTS OUT AN ARRAY IN COLUMN-MAJOR ORDER");
		columnMajor(newGridTwo);
		
	}
	
	/*
	 * Method that prints a 2D array
	 */
	public static void printArr(int[][] arr)
	{
		//for loop that traverses through a column
		for (int i = 0; i <= arr.length-1; i++)
		{
			//for loop that traverses through a row
			for (int j = 0; j <= arr[0].length-1; j++)
			{
				//Prints out the element
				System.out.print(arr[i][j]);
				System.out.print("  ");
			}
			
			System.out.println();
		}
	}
	
	/*
	 * Task 8
	 */
	public static void firstRow (int[][] arr)
	{
		//for loop that traverses through a row
		for (int i = 0; i <= arr[0].length-1; i++)
		{
			//Prints out an element in the first row, which leads to it printing all of the row's element because it increases by i
			System.out.print(arr[0][i]);
			System.out.print("  ");
		}
	}
	
	/*
	 * Task 9
	 */
	public static void firstColumn (int[][] arr)
	{
		//for loop that traverses through a column
		for (int i = 0; i <= arr.length-1; i++)
		{
			//Prints out an element in the first column, which leads to it printing all of the column's element because it increases by i
			System.out.print(arr[i][0]);
			System.out.print("  ");
		}
	}
	
	/*
	 * Task 10 (same as the printArr() method)
	 */
	public static void rowMajor(int[][] arr)
	{
		//for loop that traverses through a column
		for (int i = 0; i <= arr.length-1; i++)
		{
			//for loop that traverses through a row
			for (int j = 0; j <= arr[0].length-1; j++)
			{
				//Prints out the element
				System.out.print(arr[i][j]);
				System.out.print("  ");
			}
			
			System.out.println();
		}
	}
	
	/*
	 * Task 11 (reverse of rowMajor())
	 */
	public static void columnMajor(int[][] arr)
	{
		//for loop that traverses through a row
		for (int i = 0; i <= arr[0].length-1; i++)
		{
			//for loop that traverses through a column
			for (int j = 0; j <= arr.length-1; j++)
			{
				//Puts the column variable in the row's "spot", and puts the row variable in the column's "spot".
				//This makes it print the array in column major order
				System.out.print(arr[j][i]);
				System.out.print("  ");
			}
			
			System.out.println();
		}
	}
	
}
