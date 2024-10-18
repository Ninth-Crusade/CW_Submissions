import java.util.Scanner;

public class Strings_Intro {

	public static void main(String[] args) 
	{
	/*
	 * This code is for the scanner that lets you type in the IDE
	 */
	Scanner myReader = new Scanner(System.in);
	String myInput = new String(myReader.next());
	
	myReader.close();
	
	/*
	 * This code calls the methods that give you the breakdown of the word
	 */
	printSecondAndLastLetter(myInput);
	findThatE(myInput);
	getLength(myInput);
	printFirstAndLastThree(myInput);
	
	}
	
	/*
	 * TASK 2: This method prints the second and last letter of the word
	 */
	public static void printSecondAndLastLetter(String str)
	{
		System.out.println("The second letter is " + str.charAt(1));
		System.out.println("The last letter is " + str.charAt(str.length()-1));
	}
	
	/*
	 * TASK 3: This method prints the index of the letter "e" if it's in the word
	 */
	public static void findThatE(String str)
	{
		System.out.println("The index of e is " + str.indexOf('e'));
	}
	
	/*
	 * TASK 4: This method prints the amount of characters in the word
	 */
	public static void getLength(String str)
	{
		System.out.println("The length of the word is " + str.length() + " letters");
	}
	
	/*
	 * TASK 5: This method prints the first and last three letters of the word
	 */
	public static void printFirstAndLastThree(String str)
	{
		System.out.println("The first three letters are " + str.substring(0,3));
		System.out.print("The last three letters are " + str.substring(str.length()-3));
	}

}
