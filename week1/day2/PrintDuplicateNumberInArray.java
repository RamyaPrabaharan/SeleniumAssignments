package week1.day2;

public class PrintDuplicateNumberInArray {

	public static void main(String[] args) {
//Declare the array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//check the variables
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					//increase the count
					count=count+1;
					
				}
			}
			//System.out.println();
		}
		
	}

}
