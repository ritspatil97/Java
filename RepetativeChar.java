package Practise;

public class RepetativeChar {

	public static void main(String[] args) {

		String s = "abcdad";
		char c[] = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {

				if (c[i] == c[j]) {
					System.out.println(c[j] + " is getting repeated ");
					count++;

				}
			}

		}
	System.out.println(count);


	
	}

}
