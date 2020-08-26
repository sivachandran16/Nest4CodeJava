
public class Day7_Penguin extends Day7_Bird implements Day7_SwimBehaviour{
	
	
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
	
}
