package Theme;

import java.util.Scanner;

//write a program to find the number of days in the month using if.

public class Task2_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the month");
		int month=sc.nextInt();
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if((month==2)&&(year%4==0))
		{
			System.out.println("Number of days is 29");
		}
		else if(month==2)
		{
			System.out.println("Number of days is 28");
		}
		else if(month==1 || month==3 || month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("Number of days is 31");
		}
		else
		{
			System.out.println("Number of days is 30");
		}

	}

}
