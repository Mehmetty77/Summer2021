package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		// 
		
		List<Integer> list=new ArrayList<>();
		list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        
        
        
        
	}

	public static void increaseByTwo(List<Integer>list) {
		
		for(int i=0;i<list.size();i++) {
			list.set(i,list.get(i)+2);
		}
		System.out.println(list);
		
	}
}
