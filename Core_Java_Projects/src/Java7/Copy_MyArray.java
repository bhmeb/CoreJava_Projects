package Java7;

public class Copy_MyArray {
	
public static void main(String[] args) {
		
		int arr1[] = new int[] {1,2,3,4};
		int arr2[] = new int[arr1.length];
		for(int i=0; i<arr1.length;i++) {
			arr2[i] = arr1[i]; 
		}
		
		System.out.println("Display arr1: ");
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("Display arr2: ");
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}

}
