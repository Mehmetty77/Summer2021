package day06ternary_switch;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		// 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter an integer ");
		int x = scanner.nextInt();
		
		String result = x<5 ? "True" : "False";
		System.out.println(result);
		
		
		String result1 = x++ > 5 ? "True" : x + "";
 		
		

	}

}
