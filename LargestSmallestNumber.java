package stringname;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		
		//Array of 10 elements
	int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
	
		//assign largest and smallest element to first element of array
	 int smallest = arr[0];
	 int largest = arr[0];
	 
	 for(int i = 1; i< arr.length; i++) 
	 {
		 if(arr[i] > largest) 
			 arr[i] =  largest;
		 else if(arr[i] < smallest)
			 arr[i] = smallest;
	 	}

	}
}