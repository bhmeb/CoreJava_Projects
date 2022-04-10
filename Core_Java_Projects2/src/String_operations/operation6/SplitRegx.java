package String_operations.operation6;

public class SplitRegx {
	
	public static void main(String[] args) {
		
		String str="Javatpointtt";
		
		String[] s=str.split("t", 3); //use all 0,1,2,3 and then see
		for(String w:s) {
			System.out.println(w);
		}
		System.out.println("Split array length: "+s.length);
	}
}
