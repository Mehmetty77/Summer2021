package day19arraylists;
import java.util.ArrayList;
public class Lists02 {
    public static void main(String[] args) {
        
        //how to update an element
        
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("Ali");
        listStr.add("Veli");
        listStr.add("Bahar");
        listStr.add("Zeki");
        listStr.add("Umay");
        listStr.add("Muhammet");
        listStr.add("Kaan");
        listStr.add("Leyla");
        
        System.out.println(listStr);
        
        //set = remove+add;
        //we use set to update a value of an elemnt
        
        listStr.set(1, "Selen");
        System.out.println("After setting a value :"+listStr);
        
        listStr.set(listStr.indexOf("Ali"),"Mecnun");
        System.out.println(listStr);
        
    }
}