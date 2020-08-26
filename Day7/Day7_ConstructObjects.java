
public class Day7_ConstructObjects {
	public static void main(String[] args) {
		
		// Penguin
		Day7_Penguin penguinobj = new Day7_Penguin();
		System.out.println("Penguin Chracteristics\n");
		penguinobj.sound();
		penguinobj.swim();
		penguinobj.bird_char(15,90,"white","male");
		penguinobj.display();
		
		//Ostrich
		Day7_Ostrich ostrichobj = new Day7_Ostrich();
		System.out.println("\nOstrich Chracteristics\n");
		ostrichobj.sound();
		ostrichobj.laying_egg();
		ostrichobj.bird_char(21,20,"red","female");
		ostrichobj.display();
		
		//Parrot
		Day7_Parrot parrotobj = new Day7_Parrot();
		System.out.println("\nParrot Chracteristics\n");
		parrotobj.sound();
		parrotobj.fly();
		parrotobj.bird_char(10,12,"green","male");
		parrotobj.display();
	}

}
 