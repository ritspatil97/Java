package Practise;

public class ReverseEachWord {

	public static void main(String[] args) {
	/*	
		String str ="Welcome to java";
		String [] words = str.split(" ");
		
		String reverseString="";
		
		for(String w:words) {
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString=reverseString+reverseword+" ";
		}
		
		System.out.println(reverseString);
	*/	
//Approach 2 
		
		
		String s="hi hello to ";
		String [] ch = s.split("\\s");
		
		String r="";
		
		for(String v :ch)
		{
			StringBuilder sbl = new StringBuilder();
			sbl.append(v);
			StringBuilder rr = sbl.reverse();
			System.out.print(" "+rr);
			
			
		}

	}

}
