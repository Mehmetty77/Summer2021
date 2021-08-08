package day28exceptions;
public class E03 {
    public static void main(String[] args) {
        
        /*
         * 1)ArrayIndexOutOfBoundsException 
         *   unchecked exception
         *   when we try to get an element from an unexisting  index
         *   
         * 2)ClassCastException
         *   unchecked exception
         *   when we try to cast a data type into another one which is not supported
         *   
         * 3)NumberFormatException
         *   unchecked exception
         *   when we try to convert non-digit char to the integer by using parseInt  
         * 
         */
        
        //ArrayIndexOutOfBoundsException
//      
//      String s[]= {"Selen","Zeki","Bahar","Muhammed"};
//      System.out.println(s[0]);//selen
//      try {
//      System.out.println(s[6]);
//      }catch(ArrayIndexOutOfBoundsException e) {
//          System.out.println("Please check the length of your array ;( " +e.getMessage());
//      }
        
        //ClassCastException
        
//      Object o = 43;
//      
//      //String num =o;
//      String num = (String)o;
//      
        
        //NumberFormatException
        String s1 = "123";
        System.out.println("before converting to the string "+s1);
        int num1 = Integer.parseInt(s1);//convert our string into an integer
        System.out.println(num1+2);
        
        String s2 = "2e4r5t";
        try {
        int num2 = Integer.parseInt(s2);
        System.out.println(num2);
        }catch(NumberFormatException e) {
            System.out.println("You try to convert unnumerical characters to the integer. Do not do that!");
        }
        
        
        
    }
}