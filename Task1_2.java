package Theme;

import java.util.Scanner;
//write a program to print area and perimeter of circle
public class Task1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int rad=sc.nextInt();
		double perimeter=2*3.14*rad;
		double area=3.14*rad*rad;
		System.out.println("The perimeter of the circle is "+perimeter);
		System.out.println("The area of the circle is "+area);

	}

}
