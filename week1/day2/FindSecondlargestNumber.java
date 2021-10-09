package week1.day2;

import java.util.Arrays;

public class FindSecondlargestNumber {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		//sort the array
		
		Arrays.sort(data);
		
//		for(int i:data) {
//			System.out.println(i);
//		}
		// find second largest number
		System.out.println(data[data.length-2]);
}
}