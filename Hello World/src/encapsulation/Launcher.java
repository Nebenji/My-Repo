package encapsulation;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		EncapsulatedElevator elevator = new EncapsulatedElevator(10, 20, 1, 0.5f);
		
		//AutoImport
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Choose an option: ");
			
			System.out.println("1. Exit the elevator");
			System.out.println("2. Select floor");
			System.out.println("3. Wait");
			
			int option = scanner.nextInt();
			
			elevator.updateLocation();
			
			switch(option) {
				
				case 1: 
					elevator.exit(); 
					break;
				case 2: 
					System.out.println("Enter floor: ");
					int floor = scanner.nextInt();
					elevator.selectFloor(floor);
					break;
				case 3: 
					System.out.println("You wait.");; 
					break;
			
			}
			
			elevator.updateLocation();
			
		}
		
	}
	
}
