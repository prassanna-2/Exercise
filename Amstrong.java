package Theme;
 
import java.util.*;

public class Amstrong {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int input=num;
	int n=num;
	double res=0;
	int count=0,digit=0;
	while(input!=0)
	{
		input=input/10;
		count++;
	}
	while(n!=0)
	{
		digit=n%10;
		res=res+Math.pow(digit, count);
		n=n/10;
	}
	if(res==num)
	{
		System.out.println("amstrong number");
	}
	else {
		System.out.println("not amstrong number");
	}
	

	}

}
