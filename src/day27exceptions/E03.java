package day27exceptions;
public class E03 {
    public static void main(String[] args) {
        int a = 36;
        int b = 0;
        
        try {
        
        System.out.println(a/b);
        }catch(ArithmeticException e) {
            System.err.println("Zero divison error. Do not use zero as a divider " + e.getMessage());
            System.err.println("you reach the infinity");
            /*
             * we can use multiple catch blocks for a single try block
             * if you use multiple catch block the order should be from child to parent
             * when you use multiple catch block you can get different messages for each of them for different exceptions
             * try block can not be used alone
             * when you typed a code and you get red underline it means you have an exception and it is checked exception
             * the exception you get in a compile time is checked exception
             * 
             * when you get an exception after running your code it is unchecked exception
             * 
             * when we use "throws" and if there is an exception it will stop the execution 
             * if we use "try-catch" and if there is an exception it will not stop the execution
             * 
             */   
        }
    }
}