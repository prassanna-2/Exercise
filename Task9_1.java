package Theme_3;

import java.util.*;
//Given two arrays arr1 and arr2, concatenate them, and return the resulting array.
public class Task9_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter the elements of size "+a);
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of array2");
		int b=sc.nextInt();
		int[] arr1=new int[b];
		System.out.println("Enter the elements of size "+b);
		for(int i=0;i<b;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int size=arr.length+arr1.length;
		int[] res=new int[size];
		for(int i=0;i<a;i++)
		{
			res[i]=arr[i];
		}
		int index=0;
		for(int i=a;i<size;i++)
		{
			res[i]=arr1[index];
			index++;
		}
		System.out.println("resultant array is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
