package day05_ifelseif_nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// 
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your age and gender");
		
	    int age = scan.nextInt();
	    char  gender = scan.next().toUpperCase().charAt(0);
	    
	    if(age<0) {System.out.println("Invalid");
	    }else if(!(gender == 'M' || gender == 'F' )) {
	    	System.out.println("Invalid age and invalid gender");
	    	
	    }else if(gender == 'F') {
	    	if(age>65) {
	    		System.out.println("Retired");
	    		
	    	}else if(gender == 'F') {
	    		if (age >60) { 
	    			System.out.println("Retired");
	    		}else {
	    			System.out.println("Neeed to work");
	    		}
	    	}
	    }
		
		scan.close();
		
		

	}

}
