package Practise;

public class SumofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,4,5,6};
		int len = a.length;
		int sum=0;
		for(int i = 0;i<len;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		//enhaced for loop 
		for(int value :a)
		{
			sum=sum+value;
		}
		System.out.println(sum);
	}

}
