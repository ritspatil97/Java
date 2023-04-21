package Practise;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no ");
		int num = sc.nextInt();

		int sum = 0;

		while (num > 0) {

			sum = sum + num % 10; // 0+4=4
			num = num / 10; //
			
		}

		System.out.println("sum is " + sum);

	}

}
