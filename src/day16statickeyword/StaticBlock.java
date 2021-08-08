package day16statickeyword;

public class StaticBlock {
	static int age;
	static int year=2020;

	static {
		age=21;
		
	}
	static {
		System.out.println("Static1");
	}
	static {
		System.out.println("Static2");
	}
	static {
		System.out.println("Static3");
	}
	
	
	
	public static void main(String[] args) {
		// 
       test1();
       System.out.println("This is my main method");
	   test2();
		
		
	}
	public static void test1() {
		System.out.println("test1");
	}
	
	public static void test2() {
		System.out.println("test2");
	}
}
