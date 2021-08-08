package day25encapsulationandinterviewquestions;

import java.util.Scanner;

public class InterviewQuestion05 {

	public static void main(String[] args) {
		// 
		 // Create a method to check if a number is armstrong or not
        //153 is an armstrong number
        //1*1*1  +  5*5*5  +  3*3*3 =153
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num= scan.nextInt();
		
	    armstrong(num);

	}

	
	
	public static void armstrong(int num) {
		int sum=0;
		String str=""+ num;
	for (int i = 0; i <str.length(); i++) {
		
		char ch=str.charAt(i);
		int x= Character.getNumericValue(ch);
		
		
			sum+=x*x*x;
		}
		
	if(sum==num) {System.out.println("It is armstrong number");
		
	}else {System.out.println("It is not armstrong number");
		
	}
	
	
	}
}
