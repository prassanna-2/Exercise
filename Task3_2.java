package theme_2;

import java.util.*;

public class Task3_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,a;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num>0)
		{
			a=num%10;
			rev=rev*10+a;
			num=num/10;	
		}
		System.out.println(rev);

	}

}
