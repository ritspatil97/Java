package Practise;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter a string ");
		String str = sc.nextLine();
		
		int len = str.length();
		String rev = ""  ;
	//	str.charAt(0);
		for (int i =len-1;i>=0;i--)
		{
			
			rev= rev+str.charAt(i);
			
		}
		System.out.println(rev);
	*/

		//using stringBuffer class 
	/*	
		System.out.println("Enter a stirng ");
		String string = sc.nextLine();
		StringBuffer sb = new StringBuffer(string );
		StringBuffer reverseString = sb.reverse();
		System.out.println(reverseString);
	*/	
		
		// USING charArray
		
		System.out.println("Enter a string");
		String strr = sc.nextLine();
		String revv="";
		char a[] = strr.toCharArray();
		int len = strr.length();
		
		for(int i=len-1;i>=0;i--)
		{
			  //System.out.print(a[i]);
			revv= revv+a[i];
		}
		System.out.println(revv);
	}

}
