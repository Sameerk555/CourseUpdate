package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysFuntion {
	
	public static void main(String []args) {
		int []arr= {1, 2, 3, 5, 7, 8};
		
		int []arr2= {1, 7, 8, 11, 23, 6};
		
//		Arrays.fill(arr, 10);
		
//		for(int i : arr) {
//			System.out.println(i);
//		}
		int a=Arrays.binarySearch(arr, 5);
		
		System.out.println(a);
		
//		List<int[]>l= Arrays.asList(arr);
		
		int c=Arrays.compare(arr, arr2);
		
		System.out.println(c);
		
	
	}

}
