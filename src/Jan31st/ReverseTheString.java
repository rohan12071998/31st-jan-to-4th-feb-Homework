package Jan31st;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b= "";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
	
			
		}
		System.out.println(b);
		
		


	}


		
		
}