package week1.day2;

public class EvenWordReverse {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] splittext = test.split(" ");

		String val = "";
		for (int i = 0; i < splittext.length; i++) {
		    if (i % 2 == 1)
		        val = val + new StringBuilder(splittext[i]).reverse().toString() + " ";
		    else
		        val = val + splittext[i] + " ";
		}
				System.out.println(val);											
		
			}
	}

