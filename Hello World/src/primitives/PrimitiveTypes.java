package primitives;

public class PrimitiveTypes {
	/**
	 * Java has 8 primitive types in four categories:
	 * 
	 * Integer Primitives Types:
	 * 1. byte (signed 8 bits Integer value) (range: -128 - 127)
	 * 2. short (signed 16 bit Integer value)(range: -32,768 - 32767)
	 * 3. int (signed 32 bit Integer value) (range: -2^31 - (2^32)-1)
	 * 4. long (signed 64 bit Integer value) (range: -2^63 - (2^64)-1)
	 * 
	 * Floating Point Primitive Types:
	 * 1. float (32 bits of precision)
	 * 2. double (64 bits of precision) (number in Javascript)
	 * 
	 * Boolean Types:
	 * 1. boolean (true or false)
	 * 
	 * Character Types:
	 * 1. char (16 bits unsigned integer value represented as a character)
	 *                  unsigned - means no negative value
	 */
	
	public static void main(String[] args) {
		
		// Variable declaration requires two things:
		// [data type] [variable name]
		byte myByte;
		// Assignment of value
		myByte = 2;
		
		// All together
		short myShort = 5;
		
		int myInt = 5000;
		long myLong = 1234567890000L; // L means that it's a long literal 
		
		// A whole number typed without any other qualifier; is considered an int literal
		float myFloat = 2.5f; // f qualifier defines a float literal
		double myDouble = 2.5; // Any value with a decimal point and other qualifier is a double literal
		
		double myBigDouble = 2.7900929309029;
		
		System.out.println(myBigDouble);
		
		// Primitive types in Java are the only types that are not considered objects.
		// Everything else in Java is represented as an object with a defining class.
		// This makes primitives a somewhat lower level concept than other types in Java.
		
		// Primitives are also always defined with a lower case - however classes are traditionally
		// (And should be) assigned with an upper case.
		
		// Math operations can be used directly on primitives in the same way as JavaScript
		// Math Operators: + - / * %
		// Logical Operators: || && == ^ ! &
		
		// Control structures, largely the same except for declarations.
		// for(int i = 0; i = 10; i++)()
		
		// Java does not support truthly falsely values. Boolean strictly true or false
		
	}
	

}
