package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 //Declare a String 
			String text1 = "stops";
		 //Declare another String
			String text2 = "potss"; 
			boolean status;
			if (text1.length()!=text2.length()) 
			{
				System.out.println("Different text length.Texts cannot be Anagram");
			}
			else
			{
				char[] charArray1=text1.toCharArray();
				char[] charArray2=text2.toCharArray();
				Arrays.sort(charArray1);
				Arrays.sort(charArray2);	
				status = Arrays.equals(charArray1, charArray2);
				if (status==true) 
				{
					System.out.println("Both Texts are same.So, texts are Anagram");}
				else
					{
						System.out.println("Both Texts are different.So, Texts cannot be Anagram");
					}
					
				}
	}

}
