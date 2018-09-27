package encapsulation;

public class UnencapsulatedElevator {

	public float position;
	public boolean doorsOpen;
	public float moving;
	public int maxFloor;
	public int minFloor;
	public boolean musicPlaying;
	
	public void updateLocation() {
		
		position = moving;
		
		if(position > maxFloor) {
			
			System.out.println("The elevator crashed through the roof!");
			System.exit(1);
			
		}
		
		if(position < minFloor) {
			
			System.out.println("The elevator crashed into the ground!");
			System.exit(1);
			
		}
		
	}
	
	public void exit() {
		
		if(!doorsOpen) {
			
			System.out.println("The door was closed! Bam!");
			return;
			
		}
		
		if(Math.abs(position - Math.round(position)) < 0.1) {
		
			System.out.println("You have successfully exited the elevator!");
			
		}
		else {
			
			System.out.println("Elevators are dangerous! You died!");
			
		}
		
	}
	
	public void upButton() {
		
		System.out.println("The elevator is going up!");
		moving = 0.238f * 2;
		
	}
	
	public void downButton() {
		
		System.out.println("The elevator is going down!");
		moving = -0.257f * 2;
		
	}
	
	public void stopButton() {
		
		System.out.println("The elevator has stopped!");
		moving = 0;
		
	}
	
}
