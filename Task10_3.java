package Theme_3;

import java.util.*;

public class Task10_3 {

	public static void check(int a[],int b[])
	{
		boolean res=true;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					res=false;
					break;
				}
			}
		}
		else
		{
			res=false;
		}
		if(res)
		{
			System.out.println("Equal Arrays");
		}
		else
		{
			System.out.println("Not Equal Arrays");
		}
	}
	
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the 1st array");
	int a=sc.nextInt();
	int[] arr1=new int[a];
	System.out.println("Enter the elements");
	for(int i=0;i<a;i++)
	{
		arr1[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr1));
	System.out.println("Enter the size of the 2nd array");
	int b=sc.nextInt();
	int[] arr2=new int[b];
	System.out.println("Enter the elements");
	for(int i=0;i<b;i++)
	{
		arr2[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(arr2));
	check(arr1,arr2);
	}

}
