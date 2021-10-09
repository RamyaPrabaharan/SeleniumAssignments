package week1.day1;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
    int number=-40;
    int result = 0;
    if(number<0) {
    		result=number*(-1);
    System.out.println("The number:" +number+ " is negative it is converted into positive " +result);}
    else if(number>0) {
    	System.out.println("The number is positive" +number);}
    else {
    	System.out.println("the number is neutral");
    }
    	
    }
    
}

