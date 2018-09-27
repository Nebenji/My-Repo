package inheritance;

public class DressShirt extends Shirt {

	private boolean hasButtons;
	private boolean haslongSleeves;
	
	public boolean isHasButtons() {
		return hasButtons;
	}
	public void setHasButtons(boolean hasButtons) {
		this.hasButtons = hasButtons;
	}
	public boolean isHaslongSleeves() {
		return haslongSleeves;
	}
	public void setHaslongSleeves(boolean haslongSleeves) {
		this.haslongSleeves = haslongSleeves;
	}
	
	public void active() {
		
		if((haslongSleeves && hasButtons) && true) {

			System.out.println("Loosen your buttons and roll up your sleeves to stay cool!");
			
		}
		else if(haslongSleeves){
			
			System.out.println("Roll up your sleeves to stay cool!");
			
		}
		else if(hasButtons) {
			
			System.out.println("Loosen your buttons to stay cool!");
			
		}else {
			
			System.out.println("You are all ready to be active!");
			
		}
		
	}
	
}
