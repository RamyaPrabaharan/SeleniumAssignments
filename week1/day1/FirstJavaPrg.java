package week1.day1;

public class FirstJavaPrg {

	public static void main(String[] args) {
		int n = 8;int i;
		int number = -7;

// If the number is divisible by 3, print as TRIZZ, If the number is divisible by 5, print as FIZZ, If the number is divisible both by 3 and 5, print as TRIZZ-FIZZ
		if (n % 3 == 0) {
			System.out.println("TRIZZ");
		} else if (n % 5 == 0) {
			System.out.println("FRIZZ");
		} else if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("TRIZZ- FRIZZ");
		} else {
			System.out.println("not divisible by both 3 and 5");

		}
// check whether it is positive or negative number
		if (number > 0) {
			System.out.println("the number is positive");
		} else {
			System.out.println("the number is negative");
		}
// check odd or even number
		if (n % 2 == 0) {
			System.out.println("even number");}
		else
			{
				System.out.println("odd number");
			}
	//for loop
		for (i=0;i<10;i++) {
			System.out.println(i);
		}
		}
	}


