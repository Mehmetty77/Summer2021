package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number");
  
		 int num = scan.nextInt();
		
		 if(num %2 == 0) {
			
			System.out.println("The number is even");
			
	
		}
	  
		if(num %2 != 0) {
			System.out.println("The number is odd");
		} 
		
		System.out.println("enter another number");
		int num2 = scan.nextInt();
		
		if(num2 > 0) {
			
			System.out.println("The number is positive");
			
	
		}
	  
		if(num2 < 0) {
			System.out.println("The number is negative");
		}
	
		
		 System.out.println("Enter a side of the Rectangle");
		 double side1 = scan.nextDouble();
	     System.out.println("Enter a side 2 of the Rectangle");
	     double side2 = scan.nextDouble();
	     
	     if(side1 ==side2) {
	    	 System.out.println("Square");
	 
	     }
	     
	     
	     
	   if(side1 !=side2) {
		   System.out.println("Rectangle");
		   }
	
	   
	     if(side1<0 || side2<0);
	     System.err.println("Negative numbers cannot be length");
	     
	     
	}

}
