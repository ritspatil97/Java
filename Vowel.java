package demo;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("enter a string");
		String ss = sc.next();
		String s= ss.toUpperCase();
		char[] a = s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			char ch = a[i];
			//System.out.println(ch);
			if(ch>=65 && ch<=90) {
				switch(ch)
			{
				/*case 'A':System.out.println("vowel found  is "+ch+" "); break;
				case 'E':System.out.println("vowel found  is "+ch+" "); break;
				case 'I':System.out.println("vowel found  is "+ch+" "); break;
				case 'O':System.out.println("vowel found  is "+ch+" "); break;
				case 'U':System.out.println("vowel found  is "+ch+" "); break;
				default:System.out.println(a[i]+" "+"is not vowel");
				*/
				case 'A','E','I','O','U':System.out.println("vowel found  is "+ch+" "); break;
				default:System.out.println("no vowel at "+a[i]);
					
			}}
				else {
					System.out.println("vowel not found ");
				}
		
			}}
		}


