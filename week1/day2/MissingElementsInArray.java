package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		//sort the array
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				int j=i+1;
				System.out.println(j);
				//System.out.println(i);
				break;
				
			}
		}
	}

}
