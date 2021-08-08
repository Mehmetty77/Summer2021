package day26inheritanceoverriding;

public class Animal {

	String name;
	int height;
	byte ageOfAnimal;
	
	
	
	public Animal(){
		
		System.out.println("Parent constructor ran...");
		
	}
	
	public Animal(String name) {
		this();
		System.out.println("Parent constructor with parametrs ran...");
	}
	
	public void move() {
		System.out.println("Animals move...");
	}
	public void eat() {
		System.out.println("Animals eat...");
}
}
