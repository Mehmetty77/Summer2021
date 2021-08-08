package day05_ifelseif_nestedif;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Type java code by using if-else statement.if the password is "JavaLearner", output will be "The password is true".
Otherwise, output will be "The password is false".
		 * Type java code by using if-else statement.
		 * A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		Ask user for quantity and unit price then judge and print total cost for user.
		If the quantity is less than 1000 output will be "No discount."
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password");
		
		String password = scan.nextLine();
		
		if(password.equals("JavaLearner")) {
			System.out.println("The password is true");
		}else {System.out.println("The password is false");
		
		
		}
		scan.close();
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter the cost of purchased quantity");
		double cost = scan.nextDouble();
		
		if(cost>1000) {System.out.println("You should pay"+(cost-cost/10));
		
		}else if(cost>0){System.out.println("No Discount");
		}else {System.out.println("Invalid number");}
		
		
		
	}
	

}
