
public class Day6_Mobile_Switch_Constructor {
	
// Instance Variables
	int no_of_cameras;
	int screen_size;
	int memory_capacity;
	int ram_size;
	int no_of_sim_slots;
	
// Constructor
	
	public Day6_Mobile_Switch_Constructor(int a, int b, int c, int d, int e) {
		
		no_of_cameras = a;
		screen_size = b;
		memory_capacity = c;
		ram_size = d;
		no_of_sim_slots = e;	
	}
	
// Instance Methods
	public void camera() 
	{
		System.out.println("Camera is Working");
	}

	public void s_size() 
	{
		System.out.println("Screen Dispaly is functioning");
	}
	public void memory() 
	{
		System.out.println("Memory is GOOD");
	}
	public void ram() 
	{
		System.out.println("RAM function is excellent");
	}
	public void sim_slots() 
	{
		System.out.println("Both SIM slots are working fine");
	}
	
	public void display()
	{
		System.out.println("\n ***** Mobile Specifications ***** \n");
		System.out.println("No of Cameras\t\t: "+no_of_cameras);
		System.out.println("Screen Size\t\t: "+screen_size+" inches");
		System.out.println("Memory Capacity\t\t: "+memory_capacity+" GB");
		System.out.println("RAM Size\t\t: "+ram_size+" GB");
		System.out.println("No of SIM Slot's\t: "+no_of_sim_slots);
	}
}
