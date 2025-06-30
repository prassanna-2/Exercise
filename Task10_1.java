package Theme_3;

import java.util.*;
public class Task10_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to find the index");
		int n=sc.nextInt();
		int found=0;
		if(n<0)
		{
			System.out.println("The number is less than 0");
		}
		else if(n>0)
		{
			for(int i=0;i<num;i++)
			{
				if(n==arr[i])
				{ 	found=1;
					System.out.println("Element is found at index "+i);
				}
			}
			if(found==0)
			{
				System.out.println("The element is not in the array");
			}
			
		}
		

	}

}
