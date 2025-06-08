package Theme;

import java.util.Scanner;

//write a program to check input number is positive or negative.
public class Task2_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a==0)
		{
			System.out.println("number is zero");
		}
		else if(a>0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
		

	}

}
