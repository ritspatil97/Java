package demo;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		double a = sc.nextDouble();
		System.out.println("enter the value of b");
		double b = sc.nextDouble();
		System.out.println("enter the value of c");
		double c = sc.nextDouble();
		double result = Math.cbrt(Math.pow(a,2) + Math.pow(b, 2) - Math.abs(c));
System.out.println(result +" is the result of cube root of (a^2 + b^2)-(absolute of c)");

sc.close();
		
	}

}
