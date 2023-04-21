package Practise;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class RandomNoandStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach1 - Random 
		Random rand = new Random();
		int rno = rand.nextInt(1000);
		//System.out.println(rno);
		
		double dbl= rand.nextDouble();
		//System.out.println(dbl);
		
//Approach2 math claass 
		double rnumber = Math.random();
		//System.out.println(rnumber);
		
//Approach 3 apache poi 
		
		String randnum = RandomStringUtils.randomNumeric(5);		// class from apache 
		System.out.println(randnum);
		
		String randstr = RandomStringUtils.randomAlphabetic(10);
		System.out.println(randstr);
		

	}

}
