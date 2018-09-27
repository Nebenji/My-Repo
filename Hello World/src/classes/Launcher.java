package classes;

public class Launcher {

	public static void main(String[] args) {
		
		// Instantiation of an object
//		Animal myAnimal = new Animal();
//		myAnimal.name = "Wallaby";
//		myAnimal.armCount = 2;
//		myAnimal.furColor = "brown";
//		myAnimal.eyeColor = "black";
//		myAnimal.weight = 30.0;
//		myAnimal.hasWings = false;
//		
//		myAnimal.move();
//		myAnimal.fly();
//		
//		Animal bird = new Animal();
//		bird.name = "bird";
//		bird.hasWings = true;
//		
//		bird.move();
//		bird.fly();
		
		Anime baki = new Anime();
		baki.name = "Baki the Grappler";
		baki.episodeLength = 24.5f;
		baki.genre = "Action";
		baki.numOfEpisodes = 24;
		baki.nsfw = true;
		
		baki.safe();
		baki.runtime();
		
		Anime arakawa = new Anime();
		arakawa.name = "Arakawa Under the Bridge";
		arakawa.episodeLength = 24.0f;
		arakawa.genre = "Comedy";
		arakawa.numOfEpisodes = 13;
		arakawa.nsfw = false;
		
		arakawa.safe();
		arakawa.runtime();
		
	}
	
}
