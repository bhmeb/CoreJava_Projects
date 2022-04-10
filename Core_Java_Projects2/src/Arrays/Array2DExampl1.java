package Arrays;

public class Array2DExampl1 {

	public static void main(String[] args) {
		
		int[][] input= {
				        {1,2,3},
				        {4,5,6}
		               };
         for(int i=0;i<input.length;i++) {
        	 for(int j=0;j<input[i].length;j++) {
        		 System.out.println(input[i][j]);
        	 }
         }
	}
}
