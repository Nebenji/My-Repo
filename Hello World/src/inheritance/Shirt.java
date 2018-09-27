package inheritance;

public class Shirt {

	protected String size;
	protected boolean hasSleeves;
	protected boolean hasCollar;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isHasSleeves() {
		return hasSleeves;
	}
	public void setHasSleeves(boolean hasSleeves) {
		this.hasSleeves = hasSleeves;
	}
	public boolean isHasCollar() {
		return hasCollar;
	}
	public void setHasCollar(boolean hasCollar) {
		this.hasCollar = hasCollar;
	}
	
	public void active() {
		
		if(hasSleeves) {
			
			System.out.println("Better roll up your sleeves to stay cool!");
			
		}
		else {
			
			System.out.println("You're all set to go!");
			
		}
		
	}
	
	
}
