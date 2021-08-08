package day24multithreadsyncencapsulation;

public class Test01 {

	public static void main(String[] args) {
		// 
		
		String str1="Java";
		String str2="Java";
		String str3=new String("Java");
		StringBuilder strbld1=new StringBuilder("Java");
		
		
		if(str1==str2) {
			System.out.println("str1 and str2 equal to eachother with ==");
		}//String pool
		
		if(str1==str3) {
			System.out.println("str1 and str2 equal to eachother with ==");
		}

		if(str1.equals(str3)) {
	    System.out.println("str1 and str2 equal to eachother with ==");
		}
		
		
		
	}

}
