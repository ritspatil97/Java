package Practise;

import java.util.Scanner;

public class EvenANdOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no to check");
		int num = sc.nextInt();
		
		if(num<=0)
		{
			System.out.println("enter natural no");
		}
		else
		{
			if(num%2==0)
			{
				System.out.println("even ");
			}
			else
			{
				System.out.println("odd");
			}
		}
	
	}

}
