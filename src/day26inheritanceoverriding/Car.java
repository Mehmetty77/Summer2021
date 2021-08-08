package day26inheritanceoverriding;

public class Car {

	public void move() {
		

		System.out.println("Cars move...");
		
	
		
		
	}
	/*
	 *  1)When you override a method, you can use same 
	access modifiers
	2)When you override a method,
	Access modifier in child class cannot have 
	narrower access modifier
	3)private methods cannot be overridden, because overriding means
	you want to use the method in another class but private class members
	cannot be used in other classes
	4)@Override annotation checks the overriding rules, if there is any
	missed or used wrongly overriding rule, it will give CTE.
	 */
}
