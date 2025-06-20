package Theme_3;

import java.util.*;

public class Task9_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max value is "+max);
		

	}

}
