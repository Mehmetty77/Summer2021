package day01variables;

import java.util.Scanner;

public class Variable02 {

	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Hey User,enter the side lengths of a triangle to calculate perimeter" );
	
	byte sidea = scanner.nextByte();
	byte sideb = scanner.nextByte();
	byte sidec = scanner.nextByte();
	
	System.out.println("Perimeter:" + (sidea+sideb+sidec));
	
	}

}
