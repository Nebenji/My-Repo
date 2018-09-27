package inheritance;

public class TShirt extends Shirt {

	private boolean hasShortSleeves;
	private boolean hasVCut;
	
	public boolean isHasShortSleeves() {
		return hasShortSleeves;
	}
	public void setHasShortSleeves(boolean hasShortSleeves) {
		this.hasShortSleeves = hasShortSleeves;
	}
	public boolean isHasVCut() {
		return hasVCut;
	}
	public void setHasVCut(boolean hasVCut) {
		this.hasVCut = hasVCut;
	}
	
	public void active() {
		
		if(hasSleeves && !hasShortSleeves) {
			
			System.out.println("You're not wearing a T-Shirt!");
			
		}else {
		
			System.out.println("You're all ready to be active!");
			
		}
		
		
	}
	
}
