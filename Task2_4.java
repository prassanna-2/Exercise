package Theme;

import java.util.*;

//check given number is prime number or not
public class Task2_4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("Enter the number");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
		count++;
		}
	}
	if(count==2)
	{
		System.out.println("Prime number");
	}
	else {
		System.out.println("Not a prime number");
	}

	}

}
