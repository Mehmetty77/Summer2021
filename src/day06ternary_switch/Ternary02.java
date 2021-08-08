package day06ternary_switch;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		// 
		/*
		 * Type java code by using ternary and if-else. Ask user to enter two integers
Write a program to print the minimum one on the console.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//1.Way : If else
		
		if (a<b) {System.out.println("The Minimum : "+a);
			
		}else if(b<a) {System.out.println("The Minimum : "+b);
			
		}else {System.out.println("equal");
		}
		
		//1.Way : If else
		int result = a<b ? a : b;
		System.out.println("The Minimum: "+ result);
	
		
		
	}

}
