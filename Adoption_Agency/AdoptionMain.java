
public class AdoptionMain {

	public static void main(String[] args) 
	{
		Dog foxy = new Dog (13, "Foxy", true);
		PuppyDog nova = new PuppyDog(4, "Nova", false, false);
		
		System.out.println(foxy.getAdoptionStatus());
		System.out.println(nova.getAdoptionStatus());
		
		System.out.println();
		
		foxy.stateAge();
		nova.stateAge();
	
		System.out.println();
		
		foxy.increaseAge();
		nova.increaseAge();
		
		foxy.stateAge();
		nova.stateAge();
		
		System.out.println();
		
		System.out.println(foxy);
		
		System.out.println();
		
		System.out.println(nova);
		System.out.println();
		
		Dog coco = new Dog (2, "Coco", false);
		Dog coco2 = new Dog(2, "Coco", false);
		
		System.out.print(coco.equals(coco2));
	}

}
