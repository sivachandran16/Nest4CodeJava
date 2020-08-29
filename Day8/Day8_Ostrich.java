
public class Day8_Ostrich extends Day8_Bird{

	
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
	
	@Override
	public void eat(String food) {
		System.out.println("Ostrich is eating: "+food);
	}

}
