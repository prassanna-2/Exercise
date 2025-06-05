package Theme;

import java.util.Scanner;
//write a program to print student rollno,name,mark s1 to s3 and compute average
public class Task1_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student1 roll_no,name,mark");
		int roll_1=sc.nextInt();
		sc.nextLine();
		String name_1=sc.nextLine();
		double mark_1=sc.nextDouble();
		System.out.println("Enter the student2 roll_no,name,mark");
		int roll_2=sc.nextInt();
		sc.nextLine();
		String name_2=sc.nextLine();
		double mark_2=sc.nextDouble();
		System.out.println("Enter the student3 roll_no,name,mark");
		int roll_3=sc.nextInt();
		sc.nextLine();
		String name_3=sc.nextLine();
		double mark_3=sc.nextDouble();
		double avg=(mark_1+mark_2+mark_3)/3;
		System.out.println("roll_no1:"+roll_1+" name1:"+name_1+" mark1:"+mark_1);
		System.out.println("roll_no2:"+roll_2+" name2:"+name_2+" mark2:"+mark_2);
		System.out.println("roll_no3:"+roll_3+" name3:"+name_3+" mark3:"+mark_3);
		System.out.println("The average of student is "+avg);

	}

}
