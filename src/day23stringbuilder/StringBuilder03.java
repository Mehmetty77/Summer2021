package day23stringbuilder;

public class StringBuilder03 {
    
	public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("I love Java");
        StringBuilder sb2 = new StringBuilder("I love Java");
        
        //how to handle this?
        //we can convert them into the string
        System.out.println((sb1.toString()).equals(sb2.toString()));
        
        //compareTo()
        //System.out.println(sb1.compareTo(sb2));
        //it will 0 if they have same chars
        //it will give -1 if they are not same
        
    }
}
