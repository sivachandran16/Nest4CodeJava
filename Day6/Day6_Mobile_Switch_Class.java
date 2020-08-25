
public class Day6_Mobile_Switch_Class {
	public static void main(String[] args) {
		Day6_Mobile_Switch s1 = new Day6_Mobile_Switch();
		
	// Set Instance Variables
		
		s1.no_of_cameras =4;
		s1.screen_size=6;
		s1.memory_capacity=128;
		s1.ram_size=4;
		s1.no_of_sim_slots=2;


		
	// Call Methods
		
		s1.camera();
		s1.memory();
		s1.ram();
		s1.s_size();
		s1.sim_slots();
		
	// Constructor with 5 arguments for all instance variables	
		Day6_Mobile_Switch_Constructor mobileobj1 = new Day6_Mobile_Switch_Constructor(6,5,256,8,2);
		mobileobj1.display();
		
		Day6_Mobile_Switch_Constructor mobileobj2 = new Day6_Mobile_Switch_Constructor(8,6,512,12,4);
		mobileobj2.display();	
	}

}
