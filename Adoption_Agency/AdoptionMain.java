
public class AdoptionMain {

	public static void main(String[] args) 
	{
		//Makes the dog and puppy objects
		Dog foxy = new Dog (13, "Foxy", true);
		PuppyDog nova = new PuppyDog(4, "Nova", false, false);
		
		//Prints out the dogs' adoption status
		System.out.println(foxy.getAdoptionStatus());
		System.out.println(nova.getAdoptionStatus());
		
		System.out.println();
		
		//States the age of both dogs
		foxy.stateAge();
		nova.stateAge();
	
		System.out.println();
		
		//Increases the age of both dogs
		foxy.increaseAge();
		nova.increaseAge();
		
		//Restates the age of both dogs, now with their increased ages
		foxy.stateAge();
		nova.stateAge();
		
		System.out.println();
		
		//Prints out the characteristics of Foxy
		System.out.println(foxy);
		
		System.out.println();
		
		//Prints out the characteristics of Nova
		System.out.println(nova);
		
		System.out.println();
		
		//Makes two identical Dog objects
		Dog coco = new Dog (2, "Coco", false);
		Dog coco2 = new Dog(2, "Coco", false);
		
		//Prints out the first Dog when the second Dog is being passed in it
		System.out.print(coco.equals(coco2));
	}

}

