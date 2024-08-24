/*
 * This code is for the assignment "Practicing Systems and Primitives"
 * and does four different prints
 */
public class Practicing_System_And_Primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Task 1: This code prints my name, "JAYVEN" and ever letter is 
		 * made of the number "0"
		 */
		System.out.println("00000   000   0   0  0    0  00000  0   0");
		System.out.println("  0    0   0  0   0  0    0  0      00  0");
		System.out.println("  0    00000   000    0  0   000    0 0 0");
		System.out.println("0 0    0   0    0     0  0   0      0  00");
		System.out.println(" 0     0   0    0      00    00000  0   0");
		
		//Task 2: This code is used to solve a math problem
		System.out.println();
		double prod1=6.0*3.5;
		double prod2=1.5*5;
		double top=prod1-prod2;
		double bot=55.6-30.2;
		double answ=top/bot;
		System.out.println(answ);
		
		/*Task 3: This code prints out the circumference and area of a 
		 * circle that has a radius of 4.0
		 */
		
		//Circumference for Circle
		System.out.println();
		double radius=4.0;
		double dos=2;
		double pi=3.14;
		double circumference=dos*pi*radius;
		System.out.print("Circumference: ");
		System.out.println(circumference);
		
		//Area for Circle
		double radsquared=radius*radius;
		double area=pi*radsquared;
		System.out.print("Area: ");
		System.out.print(area);
				
	}

}
