import java.util.ArrayList;

public class Array_List_Intro {

	public static void main(String[] args) {
		/*
		 * Task 1: Instantiate an array list that can have any type in it
		 */
		ArrayList list = new ArrayList();
		
		/*
		 * Task 2: Instantiate an array list that stores integers, instantiate another one that stores strings
		 */
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<String> strArrList = new ArrayList<String>();
		
		/*
		 * Task 3: Add 1, 2, and 3 to intArrList; add "Alice," "Bob," and "Charlie" to strArrList
		 */
		intArrList.add(1);
		intArrList.add(2);
		intArrList.add(3);
		
		strArrList.add("Alice");
		strArrList.add("Bob");
		strArrList.add("Charlie");
		
		/*
		 * Task 4: Add '5' to make it the third element in intArrList; add "Derek" to make it the second element
		 * in strArrList
		 */
		intArrList.add(2, 5);
		strArrList.add(1, "Derek");
		
		/*
		 * Task 5: Print out the second and last element in intArrList and strArrList
		 */
		System.out.println("ArrayList: " + intArrList);
		System.out.println("Second element: " + intArrList.get(1));
		System.out.println("Last element: " + intArrList.get(intArrList.size()-1));
		
		System.out.println();
		
		System.out.println("ArrayList: " + strArrList);
		System.out.println("Second element: " + strArrList.get(1));
		System.out.println("Last element: " + strArrList.get(intArrList.size()-1));
		
		System.out.println();
		
		/*
		 * Task 6: Changes the first element in intArrList to 0 and strArrList to "Zero", as well as prints the old and new element
		 */
		System.out.println("Old element: " + intArrList.get(0));
		intArrList.set(0, 0);
		System.out.println("New element: " + intArrList.get(0));
		System.out.println("New ArrayList: " +intArrList);
		
		System.out.println();
		
		System.out.println("Old element: " + strArrList.get(0));
		strArrList.set(0, "Zero");
		System.out.println("New element: " + strArrList.get(0));
		System.out.println("New ArrayList: " + strArrList);
		
		System.out.println();
		
		/*
		 * Task 7: Delete the last element in both arrays and print out the removed elements
		 */
		System.out.println("Deleted element: " + intArrList.remove(intArrList.size()-1));
		System.out.println("Deleted element: " + strArrList.remove(strArrList.size()-1));
		System.out.println("New ArrayList: " + intArrList);
		System.out.println("New ArrayList: " + strArrList);
		
	}

}
