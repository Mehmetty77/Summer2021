package day03increment_decrement_operations;

public class Decrement01 {

	public static void main(String[] args) {
		
		// Subtraction and division
		
		int num=100;
		
		num = num-5;
		
		System.out.println("new value is" + num);
		
		num -=5;
		
		num--;
		
		System.out.println(num);
		
		int salary = 5000;
		//Division
		
		salary = salary / 5;
		
		salary /=5;
		
		System.out.println(salary);
	
	    int alisSalary  = 600;
	    int veliSsalary  = 600;
	    
	    
	    System.out.println(alisSalary - alisSalary*0.2);
	    System.out.println(veliSsalary - 100 - veliSsalary*0.2);
	    		
	    alisSalary = (int) (alisSalary*0.8);
	    
	    alisSalary +=100;
	    
	    System.out.println("Final Ali's Salary" + alisSalary);
	    System.out.println("Final Veli's Salary" + alisSalary);		
	    
	    
	}

}
