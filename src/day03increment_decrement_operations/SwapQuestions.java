package day03increment_decrement_operations;

import java.util.Scanner;

public class SwapQuestions {

	public static void main(String[] args) {
		
		/*
		 Swap the values of tewo integer
		
		 a= 12; b = 5 ==> a=5 ; b= 12
		
		 */
		int a = 12;
		int b = 5;
		int temp =0;
		System.out.println("Before the swap a is " +a);
		System.out.println("Before the swap b is " +b);
		
		// assign b to temp
		temp = b;
		//assign a to b
		b= a;
		//assign temp to a
		a= temp;
		System.out.println("After the swap a is " +a);
		System.out.println("After the swap b is " +b);
		
		
		//2. way Do not use 3rd container
		
		int c = 20; // c=15
		int d = 15; // d=20
		
		System.out.println("Before the swap c is " +c);
		System.out.println("Before the swap d is " +d);
		
		
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.out.println("After the swap c is " +c);
		System.out.println("After the swap d is " +d);
		
		
		
		
		
	}

}
