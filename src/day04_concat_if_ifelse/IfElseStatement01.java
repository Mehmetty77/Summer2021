package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner scan = new Scanner(System.in);
		
		 System.out.println("Enter a side of the Rectangle");
		 double side1 = scan.nextDouble();
	     System.out.println("Enter a side 2 of the Rectangle");
	     double side2 = scan.nextDouble();
	     
	     if(side1 ==side2) {
	    	 System.out.println("Square");
	 
	     }else {
	    	 System.out.println("Rectangle");
	    	 
	    
	     }
		

	}

}
