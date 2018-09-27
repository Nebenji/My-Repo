package inheritance;

public class Launcher {
	
	public static void main(String[] args) {
	
//		Computer computer = new Computer();
//		
//		computer.setMotherboard("Zoinks 8200x");
//		System.out.println(computer);
//		
//		LaptopComputer laptop = new LaptopComputer();
//		
//		DesktopComputer desktop = new DesktopComputer();
//		
//		if(desktop instanceof Computer) {
//			
//			System.out.println("It was.");
//			
//		}
//		else {
//			
//			System.out.println("It wasn't.");
//			
//		}
		Shirt shirt = new Shirt();
		shirt.hasCollar = false;
		shirt.hasSleeves = true;
		shirt.size = "Large";
		
		shirt.active();
		
		TShirt tShirt = new TShirt();
		tShirt.size = "Medium";
		tShirt.hasSleeves = true;
		tShirt.hasCollar = false;
		tShirt.setHasShortSleeves(true);
		tShirt.setHasVCut(false);
		
		tShirt.active();
		
		DressShirt polo = new DressShirt();
		polo.hasCollar = true;
		polo.hasSleeves = true;
		polo.size = "Small";
		polo.setHasButtons(true);
		polo.setHaslongSleeves(false);
		
		polo.active();
		
	}
}
