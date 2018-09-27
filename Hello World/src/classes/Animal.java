package classes;

public class Animal {

	// Defining a field
	public String name;
	public int legsCount;
	public int armCount;
	public String furColor;
	public String eyeColor;
	public double weight;
	public boolean hasWings;

	// Declaring a method
	// 1. An Access Modifier: [public, protected, (default), private]
	// Note: Default may also be called package-private
	// 2. A return type or void if not returned
	// 3. Method name
	// 4. Method parameters (type name, ...)
	public void move() {

		System.out.println("The " + this.name + " moves around.");

	}

	public void fly() {

		if (this.hasWings) {

			System.out.println(this.name + " flies away!");

		} else {

			System.out.println(this.name + " immediately falls to the ground!");

		}

	}

}
