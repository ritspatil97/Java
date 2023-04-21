package Practise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingBuiltInMethods {

	public static void main(String[] args) {
	
		int a[]= {30,20,50,10};
//Approach 1		
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));

//Approach 2 
		int a1[]= {30,20,50,10};
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));

//Approach 3 - descending order 
		Integer a2[]= {30,20,50,10};
		System.out.println(Arrays.toString(a2));
		Arrays.sort(a2,Collections.reverseOrder());
		System.out.println(Arrays.toString(a2));
		
		
	}

}
