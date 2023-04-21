package Practise;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// Bubble sort 
		
		int a []= {4,2,1,5,3};
		System.out.println("before sorting "+Arrays.toString(a));
		 int n=a.length;
		 
		 for(int i=0;i<n;i++)		// no of passes 
		 {
			 for(int j=0;j<n-1;j++)		// iterations
			 {
				 if(a[j]>a[j+1])
				 {
//					 int temp = a[j];
//					 a[j]=a[j+1];
//					 a[j+1]=temp;
////					 a[j+1]=a[j]+a[+]-(a[j]=a[j+1]);
					 
					 a[j]= a[j]+a[j+1];
					a[j+1]= a[j]-a[j+1];
					a[j]= a[j]-a[j+1];
					 
				 }
			 }
		 }
		
		System.out.println(Arrays.toString(a));

	}

}
