package inheritance;

public class Computer {

	String motherboard;
	int ghz;
	int ram;
	
	public String getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	public int getGhz() {
		return ghz;
	}
	public void setGhz(int ghz) {
		this.ghz = ghz;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	/**
	 * toString method is used to describe how an object
	 * should be presented when output to the console.
	**/
	
	@Override
	public String toString() {
		return "Computer [motherboard=" + motherboard + ", ghz=" + ghz + ", ram=" + ram + "]";
	}
	
	
	
}
