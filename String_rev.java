package theme_2;
import java.util.*;

public class String_rev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b="";
		System.out.println("Enter the string");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			b+=str.charAt(i);
		}
		System.out.println(b);

	}

}
