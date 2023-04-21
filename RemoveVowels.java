package Practise;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "java is oute";
//		char[] c = s.toCharArray();
//		System.out.println(c[3]);
//		char v[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
//		int count = 0;
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < v.length; j++) {
//				if (c[i] == v[j]) {
//					count++;
//				}
//
//			}
//
//		}
//		System.out.println(count);
		String s = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')) {
				s = (s + ch);
			}

		}
		System.out.println(s);

	}
}
