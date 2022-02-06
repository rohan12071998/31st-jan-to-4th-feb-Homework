package feb4th;

import java.util.Scanner;

public class SwapThValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int v1=6;
		int v2=8;
		System.out.println("value of variable1="+v1);
		System.out.println("value of variable2="+v2);
		System.out.println("before swapping=");
		v1=v1+v2;
		v2=v1-v2;
		v1=v1-v2;
		System.out.println("value of variable1="+v1);
		System.out.println("value of variable2="+v2);*/
		
		//By using third variable:
		int v1=6;int v2=8;int n=0;
		System.out.println("value of variable1="+v1);
		System.out.println("value of variable2="+v2);
		System.out.println("before swapping=");
		n=v1;
		v1=v2;
		v2=n;
		System.out.println("value of variable1="+v1);
		System.out.println("value of variable2="+v2);
		
		

	}

}
