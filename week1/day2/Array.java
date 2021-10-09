package week1.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// Initialize the array
		int numArr[] = { 100, 49, 398, 34, 1, 267 };

		// get the length
		int length = numArr.length;
		System.out.println("Lenght of the array is:" + length);

		// Display the array
		for (int i = 0; i < numArr.length; i++)
		{
			System.out.println(numArr[i]);

		}

       //sort the array
		Arrays.sort(numArr);
		System.out.println("Sorted array");
		
		// Display the array.
		for (int i = 0; i < numArr.length; i++)
		{
			System.out.println(numArr[i]);

		}
      
		//second largest number
		System.out.println("Second largest number:"+numArr[length - 2]);

		//second smallest number
		System.out.println("Second smallest number:"+numArr[1]);
	}

}
