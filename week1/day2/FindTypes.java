package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";				
		int  letter = 0, space = 0, num = 0, specialChar = 0;
			for (int i = 0; i < test.length(); i++) 
		{	
		if(Character.isLetter(test.charAt(i)))
			{
				letter=letter+1;
			}
			else if(Character.isDigit(test.charAt(i)))
			{
				num=num+1;
				}
			else if(Character.isSpaceChar(test.charAt(i)))
			{
				space=space+1;
			}
			else
			{
				specialChar=specialChar+1;
			}	
			
		}
			System.out.println("No of Alphabet:" +letter);
			System.out.println("No of Number:" +num);
			System.out.println("No of Space:" +space);
			System.out.println("No of Special chracters:" +specialChar);
			
		}
	}

