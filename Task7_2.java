package theme_2;

import java.util.*;
public class Task7_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int y=num;
		int dig,sum=0;
		while(y>0)
		{
			dig=y%10;
			sum=sum*10+dig;
			y=y/10;
	    }
		if(sum==num)
		{
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
		}
}
