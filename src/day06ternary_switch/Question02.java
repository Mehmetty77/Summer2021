package day06ternary_switch;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		/*
			Type java code by using nested if() statement.
			
			Ask user to enter a password 
			
			If the initial of the password is uppercase then check if it is â€˜Aâ€™ or not. 
			If it is â€˜Aâ€™ the output will be â€œValid Passwordâ€� 
			otherwise the output will be â€œInvalid Passwordâ€�
			For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
			
			If the initial of the password is lowercase then check if it is â€˜zâ€™ or not. 
			If it is â€˜zâ€™ the output will be â€œValid Passwordâ€� 
			otherwise the output will be â€œInvalid Passwordâ€�
			For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password...");
		char initial = scanner.next().charAt(0);
		
		if(initial>='A' &&       initial<='Z') {			
			if(initial=='A') {			
				System.out.println("Valid Password");				
			}else {			
				System.out.println("Invalid Password");			
			}			
		}else if(initial>='a' && initial<='z'){			
			if(initial=='z') {			
				System.out.println("Valid Password");			
			}else {			
				System.out.println("Invalid Password");			
			}			
		}else {			
			System.out.println("Use just uppercase or lowercase letters as initial....");	
		}
	}
}

