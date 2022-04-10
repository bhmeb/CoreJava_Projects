package Java7;

public class WordCount {

	public static void main(String[] args) {
		
		String w = "I am Harish";
		String arr[] = w.split(" ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
