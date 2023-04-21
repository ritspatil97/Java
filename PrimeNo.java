package Practise;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=13;
		int count=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count>0)
		{
			System.out.println("no is prime ");
		}else {
			System.out.println("no is not prime ");
		}
		
		
	}
	

}
