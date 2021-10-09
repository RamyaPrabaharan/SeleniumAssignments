package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 25, i;
		boolean flag=false;
		
		for (i = 2; i <= number / 2; i++) {
			
			if (number % i == 0) {
				System.out.println(number + "is not a prime number");
				flag = true;
				break;
			}
			else {
				System.out.println(i);		
			}
		}
		if (flag == false) {
			System.out.println(number + "is a prime number");
		}
	}
}
