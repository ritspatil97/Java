package Practise;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no ");
		int firstno = sc.nextInt();
		System.out.println("enter 2nd no");
		int secondno = sc.nextInt();
		System.out.println("enter 3rd no ");
		int thirdno = sc.nextInt();
// Approach1 
/*		if (firstno > secondno && firstno > thirdno)
		{

			System.out.println("largest no is " + firstno);
		} else if(secondno> firstno && secondno >thirdno)
		{
			System.out.println("largest no is + secondno ");
		}else{
			System.out.println("largest no is "+thirdno);
		}
*/
// Approach 2 Ternary operator 
		
		int largest = firstno > secondno ? firstno : secondno;
		int flarge = thirdno>largest ? thirdno : largest ;
		
		System.out.println("largest is "+flarge);
		
		
		
	}

}
