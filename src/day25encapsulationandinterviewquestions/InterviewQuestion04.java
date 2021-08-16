package day25encapsulationandinterviewquestions;

import java.util.Scanner;

public class InterviewQuestion04 {
    public static void main(String[] args) {
        //Create a program checks if a string is palindrome or not
        
        //Scanner scanner= new Scanner(System.in);
        //System.out.println("Please enter a string");
        //String string = scanner.nextLine().replace(" ", "").toLowerCase();

        String sentence="I love Java";
        isPalindrome(sentence);
        
    }
    
    public static void isPalindrome(String sentence) {
        String revString="";
        for (int i=sentence.length()-1;i>=0;i-- ) {
            revString+=sentence.charAt(i);
        }
        if(sentence.equals(revString)) {
            System.out.println("it is a palindrome");
        }else {
            System.out.println("Reversed sentence : "+revString+" It is not a palindrome");
        }
    }
}