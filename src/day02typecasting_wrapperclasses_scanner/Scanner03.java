package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hey User, enter a radius length of a circle to calculate the area and the perimeter ");
		
		float radius = scanner.nextFloat();
		
		System.out.println("Area :" + 3.14159*radius*radius);
		System.out.println("Perimeter :" + 2*3.14159*radius);
		

	}

}
