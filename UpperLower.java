package Practise;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="WeLcom TO nas";
		int upper=0;
		int lower=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='A' && a.charAt(i)<='Z')
			{
				upper++;
			}
			else {
				lower++;
			}
		}
		System.out.println(upper+" "+lower);
	}

}
