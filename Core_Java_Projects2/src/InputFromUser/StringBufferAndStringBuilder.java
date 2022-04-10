package InputFromUser;

import java.io.InputStream;
import java.util.Scanner;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		
		//Using String string=new String(); is strongly discouraged.
		
		/*
		StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter input: ");
		sb.append(sc.nextLine());
		System.out.println(sb);	
		*/
		
		
		System.out.println("Please enter input: ");
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		String text=sc.nextLine();
		while(text!=null) {
		sb.append(sc.nextLine());
		System.out.println(text);
		}
	}
}
