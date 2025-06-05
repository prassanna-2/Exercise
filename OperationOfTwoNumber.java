package Theme;

import java.util.Scanner;
//write a program to print sum,multiply,divide,remainder of two numbers

public class OperationOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int total=a+b;
		System.out.println("The sum of value is "+total);
		int mul=a*b;
		System.out.println("The mulplication value is "+mul);
		int div=a/b;
		System.out.println("The division value is "+div);
		int rem=a%b;
		System.out.println("The remainder value is "+rem);
	}

}
