package feb4th;

import java.util.Scanner;

public class SumOfSecondLastAndFirstDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Five Digit Number=");
		int n=sc.nextInt();
		
			int a=n%100;
			int b=n%10000;
			int sum=a+b;
			System.out.println(sum);
			
			
			
		}

	

}
