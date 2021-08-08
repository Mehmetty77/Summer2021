package day02typecasting_wrapperclasses_scanner;

public class Wrapperclass01 {

	public static void main(String[] args) {
		
		int a = 11;
		
		Integer b = 12;
		System.out.println(b.MAX_VALUE);
		//2147483647
		
		Short c = 24533;
		Short d = 123;
		System.out.println(c.MAX_VALUE);//32767
		System.out.println(c.SIZE);// 16 means c is used 16 bits in the memory
		System.out.println(c.hashCode());// It returns the adress of the non-primitive data
		
        System.out.println(c.equals(d));
        
        
        //Autoboxing
        int x = 12; 
        Integer y = x;
        System.out.println(x);
        System.out.println(y);
        
        //Unboxing
        Integer z = 23;
        int t = z;
        System.out.println(t);
        System.out.println(z);
        
	}

}
