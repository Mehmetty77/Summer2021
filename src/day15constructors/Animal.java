package day15constructors;

/*
	We use instance variables in constructors as parameters, because constructors create objects
	and they use object related variables which are instance variables.
	
	We do not use class variables inside the constructors, because class variables are related with class
	not with objects
*/

public class Animal {
	
	String name;
	int age;
	boolean isCarnivorous;
	String specy;
	char gender;
	
	static int counter;

	public Animal() {
		counter++;
	}

	public Animal(String name, int age, boolean isCarnivorous, String specy, char gender) {
		this.name = name;
		this.age = age;
		this.isCarnivorous = isCarnivorous;
		this.specy = specy;
		this.gender = gender;
		counter++;
	}

	public Animal(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		counter++;
	}

	public Animal(String specy) {
		this("Bobby", 5, 'M');
		this.specy = specy;
		counter++;
	}
	
	
	

}