package Java7.String_Replacement;

public class mergeShortDemo {
	
	public static void mergeSort(int[] arr) {
		if(arr.length<=1) {
			return;
		}
		
		//Divided into two part
		int[] a = new int[arr.length/2];
		int[] b = new int[arr.length-a.length];
		
		for(int i = 0; i<arr.length/2; i++) {
			a[i] = arr[i];
		}
		
		for(int i = arr.length/2; i<arr.length; i++) {
			b[i - arr.length/2] = arr[i];
		}
		
		mergeSort(a);
		mergeSort(b);
		merge(a,b,arr);
	}	
	
	public static void merge(int[] a, int[] b, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				arr2[k] = a[i];
				i++;
				k++;
			}else {
				arr2[k] = b[j];
				k++;
				j++;
			}
		}
		
		//copy remaining element into array
		//only one of the condition will call because only one array may have extra value.
		if(i<a.length) {
			while(i <a.length) {
			arr2[k] = a[i];
			i++;
			k++;
			}
		}
		
		if(j<b.length) {
			while(j < b.length) {
			arr2[k] = b[j];
			k++;
			j++;
			}
		}
}

	public static void main(String[] args) {
		
		int[] arr = {10,9,8,7,6,5,11,4};
		mergeSort(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
