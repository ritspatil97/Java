package Practise;

import java.util.Scanner;

public class RemoverSpecialChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string ");
		String s = sc.nextLine();

		//s = s.replaceAll("[a-zA-Z0-9]", "-");
		//System.out.println(s);
		int count=0;
		for(Character c :s.toCharArray())
		{
			boolean b = !(c.isLetter(c) || c.isWhitespace(c) || c.isDigit(c));
			if(b==true)
			{
			System.out.println(c);
			count++;
			}
		}
		System.out.println(count);
		System.out.println(s);
	}

}
