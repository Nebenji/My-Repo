package notaccess;

import access.MyClass;

public class DifferentClass {
	
	public void test(MyClass myclass) {
		// Can only access public fields
		myclass.publicField = 0;
		
	}

	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		
		myclass.publicField = 0;
		//myclass.protectedField = 0;
		//myclass.defaultField = 0;
		
	}
	
}
