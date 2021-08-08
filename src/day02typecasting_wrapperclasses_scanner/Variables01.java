package day02typecasting_wrapperclasses_scanner;

public class Variables01 {

	public static void main(String[] args) {
		
		/*byte < short < int < long < float < double
		Type Casting means converting a primitive data type to  another
		*/
		//Auto Widening//
		byte age = 65;
		short newAge = age;
		System.out.println(age);
		System.out.println(newAge);
		//Explicit narrowing
		long profit = 2345;
		int newProfit = (int)profit;
		//Type code to convert float to short
		//
		float code = 1.23f;
		short newCode = (short)code;  
		System.out.println(code);
		System.out.println(newCode);
		//If the number is not in the range of the second data type , 
		//Java uses "modulus operation" to put  value  into the range 
		short price = 258;
		byte newPrice = (byte)price;
		System.out.println(price);
		System.out.println(newPrice);
		
		/* How to do mathematical operations with different data types 
		 *  
		 * 
		 */
		
		int a = 5; 
		double b = 4;
		float e = 4.0f;
		int c = 2;
		int d = 3;
		System.out.println(a+b);
		System.out.println(a/c);
		//In double decimal you have 16 digits at most
		System.out.println(b/d);
		
		//In float decimal you have 7 digits at most
		
		System.out.println(e/d);
		
		

		
		
		
		}

}
