package day04_concat_if_ifelse;

public class OperatorSigns {

	public static void main(String[] args) {
		// = -> Assignment Operator in Java
		
		int num = 20;
		
		num  =  25;
		
		// == -> Equal Sign or Comparison Operator in Java
		
		boolean isTrue =  5+2 ==7;
		boolean isFalse = 5+2 ==8;
		
		System.out.println(isTrue);

		System.out.println(isFalse);
		
		//!= -> Not Equal Sign in java
		
		//boolean isTrue1 = 5+2 !=8;
		
		//boolean isFalse1 = 5+2 !=22;
		
		System.out.println(5==5);
		System.out.println(5!=6);
		
		//&& => and operetor ... if you have at least one false result false
		
				//|| => Or operation ....if you have just one true the result will be true
		// ">" , " >=" , "<" , "<="  ==> All returns boolean
		
		System.out.println(5>8);
		
		boolean b1 = 5>2;	   
		boolean b2 = 5==2+3;	   
		boolean b3 = 5==2;	   
		boolean b4 = 5<2; 
		
		System.out.println(b1 && b2);
		
		System.out.println(b1 && b3);
		
		System.out.println(b2 || b3);
		
		
	}

}
