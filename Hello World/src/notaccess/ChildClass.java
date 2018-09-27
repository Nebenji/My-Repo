package notaccess;

import access.MyClass;

public class ChildClass extends MyClass{
	
	// Can only access public unless protected is specified in a method
	private void accessProtected() {
		
		this.protectedField = 0;
		
	}

	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		
		myclass.publicField = 0;
		//myclass.protectedField = 0;
		//myclass.defaultField = 0;
		
	}
	
}
