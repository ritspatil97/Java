package Practise;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  ");
		
	/*	int num = 1234;
		int rev = 0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			System.out.println(rev);
			num=num/10;
			System.out.println(num );
		}
		System.out.println(rev);   
	*/
		
		
		
		// using StringBuffer class 
		/*
		//int num = 1234567;
		int num = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		*/
		// using string builder class 
		
		//int numm=67890;
		int numm = sc.nextInt();
		StringBuilder sbl = new StringBuilder();
		sbl.append(numm);
		StringBuilder revv = sbl.reverse();
		System.out.println(revv);
		
		
		
	}

}
