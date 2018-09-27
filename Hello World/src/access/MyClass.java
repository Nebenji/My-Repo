package access;

public class MyClass {
	
	public int publicField;
	protected int protectedField;
	int defaultField;
	private int privateField;
	
	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		
		myclass.publicField = 0;
		myclass.protectedField = 0;
		myclass.defaultField = 0;
		myclass.privateField = 0;
		
	}

}
