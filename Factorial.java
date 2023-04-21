package Practise;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		long fact=1;
		
	/*	for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		*/
		
		
		//
		
		for (int i=num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
