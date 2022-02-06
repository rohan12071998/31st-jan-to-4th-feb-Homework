package feb2nd;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		//String ch=sc.next();
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.print("vowel");
		}else {
			System.out.print("consonent");
					
		}

	}

}
