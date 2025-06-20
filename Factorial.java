package Theme_3;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int factorial=fact(num);
		System.out.println("factorial of the number is "+factorial);
	}
	static int fact(int n)
	{
		if(n==1||n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}

}
