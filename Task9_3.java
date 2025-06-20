package Theme_3;

import java.util.*;

public class Task9_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the element in the array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min value is "+min);

	}

}
