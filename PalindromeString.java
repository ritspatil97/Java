package Practise;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string ");
		String str = sc.nextLine();
		
		String org_string = str;
		
		//char a[] = str.toCharArray();
		int len = str.length();
		
		String rev ="";
		for(int i=len-1;i>=0;i--)
		{
			//rev= rev+a[i];
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(org_string.equals(str))
		{
			System.out.println("is palindrome ");
		}else {
			System.out.println("not palindrome ");
		}
	}

}
