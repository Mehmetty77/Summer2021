package day19arraylists;
import java.util.ArrayList;
public class Lists04 {
    public static void main(String[] args) {
        /*
         * Please create an Integer ArrayList
         * add the numbers : 3, 45, 12, 3, 6, 45, 7, 8
         * print your list
         * remove the repeated elements from your list
         * please print the unique list
         */
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(45);
        list1.add(12);
        list1.add(3);
        list1.add(6);
        list1.add(45);
        list1.add(7);
        list1.add(8);
        
        System.out.println("before removing duplicate elements: "+list1);
        
        ArrayList< Integer> listUnique = new ArrayList<>();
        for( int i =0; i<list1.size();i++) {
            if(!listUnique.contains(list1.get(i))) {
                listUnique.add(list1.get(i));
            }
//          else {
//              continue;
//          }
        }
        System.out.println("after removing duplicate elements: "+listUnique);
        
        
    }
}