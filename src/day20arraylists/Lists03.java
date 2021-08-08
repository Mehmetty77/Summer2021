package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {
		// 
		
		List<Integer> list=new ArrayList<>();
		list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
		
		
		
		
		
		
		List<Integer> list1=new ArrayList<>();
		list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(8);
        list1.add(7);
		multiply(list1);
        multiply(list);
	}

	public static void multiply(List<Integer> list1) {
		for(int i=0;i<list1.size();i++) {if(list1.get(i)%2!=0) {list1.remove(i);
		i--;
			}else {
				list1.set(i,list1.get(i)*3);
				
			}
	}
	System.out.println(list1);
}
}