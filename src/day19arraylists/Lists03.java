package day19arraylists;


import java.util.ArrayList;

import java.util.Scanner;

public class Lists03 {
    public static void main(String[] args) {
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('B');
        list1.add('E');
        list1.add('A');
        list1.add('S');
        list1.add('F');
        
        System.out.println(list1);
        
        //How to check an arrayList contains a specific element
        
        System.out.println(list1.contains('B'));
        System.out.println(list1.contains('C'));
        
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('B');
        list2.add('E');
        list2.add('A');
        list2.add('S');
        list2.add('F');
        
        System.out.println(list2);
        
        //How to check two lists equal or not
        System.out.println(list1.equals(list2));
        
        /*
         *  Ask user to enter a letter
        If the letter exist in list1 convert it to "$"
        otherwise add the element which user entered to the list1
         */
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter");
        char c = scan.next().charAt(0);
        
        if (list1.contains(c)) {
            list1.set(list1.indexOf(c), '$');
        }else {
            list1.add(c);
        }
        System.out.println(list1);
    
        
    }
}