package day16statickeyword;

import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
		// We commented out this method to call it from constructor , it will make the code more clear
		
		Scanner scan =new Scanner(System.in);
		do {
		System.out.println("Please enter your first name");
		String firstName=scan.next();
		
		System.out.println("Please enter your last name");
		String lastName=scan.next();
		
		System.out.println("Please enter your grade");
		int grade=scan.nextInt();
		
		System.out.println("Please enter your registration year");
		int year=scan.nextInt();
		
		String name = firstName+" "+lastName ; 
		
		Students student1= new Students(name,grade,year);
		//student1.setId();
		System.out.println("Student Id"+student1.id);
		
		
		//Students student2= new Students("Veli Han",5,2020);
		//student2.setId();
		//System.out.println(student2.id);
		
		System.out.println("to quit press Q, to go on press any key");
		String quit=scan.next().toUpperCase();
        if(quit.contentEquals("Q"));{
        	break;
        }
		
	}while(true);
     System.out.println("Thanks for choosing us! See you later");
}
}
