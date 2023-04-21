package Practise;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no ");
		int n1 = sc.nextInt();
		System.out.println("enter 2nd no");
		int n2 = sc.nextInt();
		System.out.println("enter a no you want a series till ");
		int n3 =sc.nextInt();
		int sum =0;
		
		System.out.print("series is "+n1+" "+n2);
		
		/*while(sum<=n3)
		{
			sum=n1+n2;		//30
			n1=n2;			//N1=20
			n2=sum;			//n2=30
			System.out.print(" "+sum);
		}*/
		
		for (int i=n2;i<n3;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
		

	}

}
