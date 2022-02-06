package feb4th;

import java.util.Scanner;

public class SumofDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three digit number=");
		int n=sc.nextInt();
		int sum=0,b=0;
		while(n>0) {
			 b=n%10;
			sum=sum+b;
			n=n/10;	
		}
		System.out.println(sum);

	}

}
