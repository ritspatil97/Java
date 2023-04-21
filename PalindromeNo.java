package Practise;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = sc.nextInt();
		int org_num = num;
		
		int rev=0;
	
		while(num!=0)
		{
			 
			 rev=rev*10 + num%10;
			 num= num/10;
		}
		System.out.println(rev);
		
		if(org_num==rev)
		{
			System.out.println("is aplindrome ");
		}else {
			System.out.println("not palindrome ");
		}
	}

}
