package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		//Declare 2 arrays
		
	    int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };
		
		//compare 2 arrays
		for (int i = 0; i < arr1.length; i++) {
			for(int j=0;j<arr2.length;j++) {
		//Intersection values		
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					
				}
			}

		}
	}

}
