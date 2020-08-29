
public class Day8_Parrot extends Day8_Bird implements Day8_FlyBehaviour{

	
	public void sound() {
	System.out.println("Parrot produces singing sound...");
	}
	
	
	public void laying_egg() {
	System.out.println("Parrot lay eggs...");
	}
	
	@Override
	public void eat(String food) {
		System.out.println("Parrot is eating: "+food);
	}
}
