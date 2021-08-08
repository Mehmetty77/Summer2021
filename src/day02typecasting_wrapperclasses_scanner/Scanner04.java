package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hey User give a rectangle side length");
		double length = scanner.nextDouble();
		
		System.out.println("Hey User give a rectangle side width");
		double width = scanner.nextDouble();
		
		System.out.println("Area:" + width*length);
		System.out.println("Perimeter:" + 2*(width*length));
		
		
	}

}
