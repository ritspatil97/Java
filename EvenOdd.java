package Practise;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();

		int even = 0;
		int odd = 0;
		int rem = 0;

		while (num > 0) {

			rem = num % 10;

			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			num = num / 10;

		}
		System.out.println(even + "are the even nos");
		System.out.println(odd + "are the odd nos");

	}

}
