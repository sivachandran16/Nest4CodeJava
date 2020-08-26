
public class Day7_Ostrich extends Day7_Bird{

	
	public void sound() {
	System.out.println("Ostrich produces hissing sound...");
	}
	

	public void laying_egg() {
	System.out.println("Ostrich lay eggs...");
	}
	
	@Override
	public void fly() {
		System.out.println("Ostrich won't fly...");
	}

}
