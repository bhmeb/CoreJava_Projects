package Java7;

public class CharFrequencyCount {

	public static void main(String[] args) {
		
		String word = "Perfact picture";
		int frq[] = new int[word.length()];
		
		int i, j;
		
		char ch[] = word.toCharArray();
		
		for(i=0; i<word.length(); i++) {
			frq[i] = 1;
			for(j = i+1; j<word.length(); j++) {
				if(ch[i] == ch[j]) {
					frq[i]++;
					ch[j] = '0';
				}
			}
		}
		
		//Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");    
        for(i = 0; i <frq.length; i++) {    
            if(ch[i] != ' ' && ch[i] != '0')    
                System.out.println(ch[i] + "-" + frq[i]);    
        }    

	}

}