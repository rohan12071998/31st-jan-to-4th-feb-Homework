package feb2nd;

import java.util.Scanner;

public class GreaterOrLesserThan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String num="";
		num=a<10 ? "smaller" : "greater" ;
		System.out.print(num);

	}

}
