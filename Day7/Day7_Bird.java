
public abstract class Day7_Bird {

	// Instance Variables
	int height;
	int weight;
	String color;
	String gender;
	
	public void bird_char(int h, int w, String c, String g) {
		
		this.height=h;
		this.weight=w;
		this.color=c;
		this.gender=g;
		
	}
	

	
	// Abstract Methods
	
	// Method1
	public abstract void sound(); 
	//Method2
	public abstract void laying_egg();
	
	// Non-Abstract Methods
	
	// Method1
	public void eat() {
		System.out.println("Eating...");
	}
	//Method2
	public void fly() {
		System.out.println("Flying...");
	}
	//Method3
	public void swim() {
		System.out.println("Swiming...");
	}
	
public void display() {
		
	System.out.println("Height..."+height);
	System.out.println("Weight..."+weight);
	System.out.println("Color..."+color);
	System.out.println("Gender..."+gender);
		
	}
	
}
