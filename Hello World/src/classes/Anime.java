package classes;

public class Anime {

	String name;
	String genre;
	float episodeLength;
	int numOfEpisodes;
	boolean nsfw;
	
	public void safe() {
		
		if(this.nsfw) {
			
			System.out.println(this.name + " is not safe to watch at work!");
			
		}
		else {
			
			System.out.println(this.name + " is safe to watch at work.");
			
		}
		
	}
	
	public void runtime() {
		
		System.out.println(this.name + " has " + this.numOfEpisodes + " episodes that are " + this.episodeLength + " minutes long each." );
		
	}
	
}
