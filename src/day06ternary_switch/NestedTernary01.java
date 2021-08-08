package day06ternary_switch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		
		int year = scanner.nextInt(); 
		
		String result = (year%100==0 ? (year%400==0 ? "Leap year" : "Not leap year"):(year%4==0 ? "leap year " : "Not leap year"));                                       
		
		System.out.println(result);
		
		
	}

}
