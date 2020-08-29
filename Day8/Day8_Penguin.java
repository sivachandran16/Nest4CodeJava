
public class Day8_Penguin extends Day8_Bird implements Day8_SwimBehaviour{
	
	
	public void sound() {
	System.out.println("Penguin produces hising sound...");
	}
	
	
	public void laying_egg() {
	System.out.println("Penguin lay eggs...");
	}
	
	
	@Override
	public void swim() {
		System.out.println("Penguin Swims...");
	}
	@Override
	public void eat(String food) {
		System.out.println("Penguin is eating: "+food);
	}
	
}
