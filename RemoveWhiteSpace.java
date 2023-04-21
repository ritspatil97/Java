package Practise;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "a d dd c f";
		s=s.replaceAll("\\s", "-");
		System.out.println(s);
	}

}
