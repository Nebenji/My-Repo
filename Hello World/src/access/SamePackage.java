package access;

public class SamePackage {

	// Access all fields except private
	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		
		myclass.publicField = 0;
		myclass.protectedField = 0;
		myclass.defaultField = 0;
		
	}
	
}
