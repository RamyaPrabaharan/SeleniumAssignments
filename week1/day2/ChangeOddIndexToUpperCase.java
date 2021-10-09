package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray=test.toCharArray();
		int length = charArray.length;
		//Traverse through each character
		for(int i=0;i<length;i++) {
			if(i%2==0) {
				char str= Character.toUpperCase(charArray[i]);	
				System.out.println(str);	
			}
			else
			{
				System.out.println(charArray[i]);
			}
		}
	}

}
