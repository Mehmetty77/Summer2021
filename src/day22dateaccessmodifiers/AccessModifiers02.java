package day22dateaccessmodifiers;


public class AccessModifiers02 {
    public static void main(String[] args) {
        /*
         * how can we access variables from another class
         * 1- if it is static we can call it y class name
         * 2-if it is not static we can call it by creating object
         */
        
        /*
         * 1- public
         * 2-default
         * 3-protected
         * 4-private
         */
        
        AccessModifiers01 obj1 = new AccessModifiers01();
        System.out.println(obj1.qa);
        
        System.out.println(AccessModifiers01.qa1);
        System.out.println(AccessModifiers01.qa2);
        /*
         * we can access public variables from anywhere
         * we can not access private variables from outside of the class
         */
        //System.out.println(obj1.qa3);
        
    
        
       
        
        
    }
}
