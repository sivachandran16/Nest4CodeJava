
public class Day8_ConstructObjects {
	public static void main(String[] args) {
		
		// Penguin
		Day8_Penguin penguinobj = new Day8_Penguin();
		System.out.println("\n*******************************************");
		System.out.println("\tPenguin Chracteristics");
		System.out.println("*******************************************");
		penguinobj.sound();
		penguinobj.swim();
		penguinobj.bird_char(35,118,"black","female");
		penguinobj.display();
		penguinobj.eat("Fish");
		penguinobj.eat("Squid");

	
		
		//Ostrich
		Day8_Ostrich ostrichobj = new Day8_Ostrich();
		System.out.println("\n*******************************************");
		System.out.println("\tOstrich Chracteristics");
		System.out.println("*******************************************");
		ostrichobj.sound();
		ostrichobj.laying_egg();
		ostrichobj.bird_char(25,40,"red","male");
		ostrichobj.display();
		ostrichobj.eat("Snakes");
		ostrichobj.eat("Lizards");
		ostrichobj.eat("Rodents");
		
		//Parrot
		Day8_Parrot parrotobj = new Day8_Parrot();
		System.out.println("\n*******************************************");
		System.out.println("\tParrot Chracteristics");
		System.out.println("*******************************************");
		parrotobj.sound();
		parrotobj.fly();
		parrotobj.bird_char(12,18,"green","female");
		parrotobj.display();
		parrotobj.eat("Seeds");
		parrotobj.eat("Fruits");
		parrotobj.eat("Insects");
	}

}
 