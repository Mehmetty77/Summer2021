package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hey User , enter your name, surname and then  adress");
		
		String name = scanner.nextLine();
		String surname = scanner.nextLine();
		String adress = scanner.nextLine();
		
		System.out.println(name +" "+ surname);
		
		System.out.println(adress);
		
		
	}

}
