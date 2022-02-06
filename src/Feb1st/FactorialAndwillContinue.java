package Feb1st;

import java.util.Scanner;

public class FactorialAndwillContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 1 or 0");
			num=sc.nextInt();
			System.out.println("Enter no for Factorial");
			int num1=sc.nextInt();
			int i=factorial(num1);
			System.out.println(i);
		}while (num!=0);
		
		}
	private static int factorial(int no) {
		int fact=1;
		for(int j=no;j>0;j--) {
			fact=fact*j;
			
		}
		return fact;
		
		
	

		
		
		
	
	
		
	
		
		
		

	}

}
