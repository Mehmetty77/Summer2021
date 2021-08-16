package day01variables;

import day23stringbuilder.StringBuilder01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Trial {

    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("src\\day27exceptions\\TextFile01");
        }catch (FileNotFoundException e){
            System.out.println("Good");
        }catch (IOException e){
            System.out.println("Bettter");
        }






    }


}
