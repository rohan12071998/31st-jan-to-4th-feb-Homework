package Jan31st;
import java.util.*;

public class StringisPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		String a="";
		for(int i=n.length()-1;i>=0;i--) {
			a= a+n.charAt(i);
			
		}
		System.out.println(a);
		String message=n.equals(a)? "Palindrome" :"non Palindrome";
		System.out.println(message);
			
			
			
		
		
		
	}

}
