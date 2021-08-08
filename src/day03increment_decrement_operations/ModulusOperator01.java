package day03increment_decrement_operations;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		
		/*
		 * Modulus Operator(%) is used to find remainder when you divide a number 
		 * 
		 *  20%5 = 0
		 *  
		 */

		
		/*
		 * System.out.println(21%5);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number which have digits more than 1");
		
		int nummer = scan.nextInt();
		
		int lastDigit = nummer %10;
		
		System.out.println(nummer%10);
		 */
		
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter a 3-Digit number");
		
		int number = scan1.nextInt();
		
		int lastDigit = 0;
		int midDigit = 0;
		int firstDigit = 0;
		int middle = 0;
		
		
		lastDigit = number%10;
		firstDigit = number/100; //256/100 = 2.56
		middle = number/10; //25.6
		midDigit = middle%10;
		
		System.out.println(firstDigit + midDigit + lastDigit );
		
		
		
		
		
		
	
	
	}

}

