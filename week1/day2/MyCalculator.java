package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator myobj = new Calculator();
		System.out.println("Addition of 3 numbers : "+myobj.add(1,2,3));
		System.out.println("Subtraction of 2 numbers : "+myobj.sub(7,5));
		System.out.println("Multiplication of 2 numbers : "+myobj.mul(6.2,2.43));
		System.out.println("Division of 2 numbers : "+myobj.divide(50,10));
	}

}
