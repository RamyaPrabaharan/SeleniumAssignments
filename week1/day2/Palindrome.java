package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam",rev="";
		char[] charArray=str.toCharArray();
		int Len=charArray.length;
		//Identify Length and convert to character
		for (int i = Len-1; i >=0; i--) {
		
			rev=rev+charArray[i];									
			
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
		System.out.println("Given string is Palindrome");
		}
		else
		{System.out.println("Given string is not Palindrome");}
		
	}

}
