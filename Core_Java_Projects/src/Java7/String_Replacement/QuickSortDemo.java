package Java7.String_Replacement;

public class QuickSortDemo {
	
	public static void quickSort(int[] arr, int startE, int endE) {
		
		if(startE >= endE) {
			return;
		}
	int pivotIndex = partition(arr,startE,endE);
    quickSort(arr, startE, pivotIndex-1);
    quickSort(arr, pivotIndex+1, endE);
	}
	
	
    
	private static int partition(int[] arr, int startE, int endE) {
		int pivotElement = arr[startE];
		int smallNumCount = 0;
		for(int i = startE + 1; i<=endE; i++) {
			if(arr[i] < pivotElement) {
				smallNumCount++;
			}
		}
		
		int temp = arr[startE + smallNumCount];
		arr[startE + smallNumCount] = pivotElement;
		arr[startE] = temp;
		
		
		int i = startE;
		int j = endE;
		while(i<j) {
			if(arr[i] < pivotElement) {
				i++;
			}else if(arr[j] >= pivotElement) {
				j--;
			}else {
				//Perfect case
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		return startE + smallNumCount;
	}



	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,11,4};
		quickSort(arr, 0, arr.length-1);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
