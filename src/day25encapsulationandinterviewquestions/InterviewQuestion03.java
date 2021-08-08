package day25encapsulationandinterviewquestions;

import java.util.Iterator;



import java.util.Scanner;
public class InterviewQuestion03 {
    public static void main(String[] args) {
        //String string = "ab3 sfr1 de ddr ff";
     /*
      * get a string from user 
      * and create a method to print the string without space
      * call the method from the main method
      */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scanner.nextLine();
        
        removeWhiteSpace(str);
    }
    
    public static void removeWhiteSpace(String str) {
        System.out.println(str.replaceAll("\\s", ""));
    }
}
