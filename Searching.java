package Practise;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[]= {"ca","ka" ,"python","java"};
		
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=="javA")
			{
				System.out.println("element found "+a[i]);
				flag=true;
			}
			
		}
		if (flag==false){
			System.out.println("not found ");
		}
		
		
		
	}

}
