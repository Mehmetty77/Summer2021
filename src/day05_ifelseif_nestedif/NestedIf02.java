package day05_ifelseif_nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		
		if(num<0 ) {if (num<-9) { System.out.println("Too small");
		
		}else {
			System.out.println("small");
			
		}
		
		
	}
		
         if(num>0 ) {if (num>9) { System.out.println("Too big");
		
		}else {
			System.out.println("big");
			
		}
		
		
		
	}else {
		System.out.println("You smart...Please enter+ or - number");}
         scan.close();

   }


}