package Java7.String_Replacement;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int startIndex, int endIndex, int searchValue) {
		
		if(startIndex>endIndex) {
			return -1;
		}
		
		int midIndex = (startIndex+endIndex)/2;
		if(arr[midIndex] == searchValue) {
			return midIndex;
		}else if(arr[midIndex] < searchValue){ //Mid+Right move
			return binarySearch(arr, midIndex+1, endIndex, searchValue);
		}else {
			return binarySearch(arr, startIndex, midIndex-1, searchValue); //Mid+Left move
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(binarySearch(arr, 0, arr.length-1, 4));
		
	}

}
