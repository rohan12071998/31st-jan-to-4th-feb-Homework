package Jan31st;

import java.util.Scanner;

public class Add3toASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char character=sc.next().charAt(0);
		int ASCII=character;
		int add=ASCII+3;
		
			System.out.print(add);
		}


}
