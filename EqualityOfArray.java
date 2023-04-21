package Practise;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 1, 3, 4, 6, 7 };
		int a2[] = { 1, 3, 4, 6, 0 };
//Approach 1		
		/*
		 * boolean flag = false;
		 * 
		 * if(Arrays.equals(a1, a2)) { System.out.println("arrays are equal"); } else {
		 * System.out.println("arrays are not equal"); }
		 */
// Approach 2 
		int count = 0;
		boolean flag = true;
		for (int i = 0; i <= a1.length - 1; i++) {

			if (a1[i] == a2[i]) {
				count++;
			} else {
				flag = false;
			}
		}

		if (flag == true) {
			System.out.println("arrayes are equal");
		} else {
			System.out.println("arrayes are not equal");
		}

		System.out.println(flag);
		System.out.println(a1.length);

	}
}