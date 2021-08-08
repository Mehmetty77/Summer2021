package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// 
		
		char crr[]= {'c','A','!','m'};
		
		Arrays.sort(crr);
		
		Arrays.binarySearch(crr, 'x');
		
		//If an element does not exist , it returns negative order number
		System.out.println(Arrays.binarySearch(crr, 'x'));//-5

		System.out.println(Arrays.binarySearch(crr, 'e'));//-3
		
		//If an element exists , it returns the index of the element
		
	}

}
