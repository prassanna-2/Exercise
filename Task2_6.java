package Theme;
//write a program to print and separate numbers btw 1 to 100(even and odd)

public class Task2_6 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even number");
			}
			else
			{
				System.out.println(i+" is odd number");
			}
		}
	}

}
