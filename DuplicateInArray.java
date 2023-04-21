package Practise;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int a1[] = {1,3,5,7,6,7};
	/*	boolean flag=false;
		//int ele=0;
		for (int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]==a1[j]) {
					System.out.println("duplicate found "+a1[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("not found ");
		}
		*/
//Approach 2 
		
		HashSet langs= new HashSet();
		/*System.out.println(langs.add(0));
		System.out.println(langs.add(7));
		System.out.println(langs.add(0));
		*/
		
		for(int value :a1)
		{
			if(langs.add(value)==false)
			{
				System.out.println("duplicte found "+value);
			}
			
		}
		

	}

}
