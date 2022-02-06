package Feb1st;
import java.util.*;

public class OddorEvenByFunction {

	public static void OddEven(int num) {
		if (num%2==0) {
			System.out.println("Even");
			return;
		}else {
			System.out.print("Odd");
			return;
		}
		

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		OddEven(num);
	}
	
	
		
	
	
}
