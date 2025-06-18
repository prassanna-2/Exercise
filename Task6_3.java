package theme_2;

public class Task6_3 {
	static int a=20;
	static int b=10;
	int c=30;
	public static void add() {
		int sum=a+b;
		System.out.println("the sum is: "+sum);
	}
	public static void multiply() {
		Task6_3 obj=new Task6_3();
		int mul=a*b*obj.c;
		System.out.println("the multiply value is: "+mul);
	}
	public void divide() {
		int div=a/b;
		System.out.println("the divide value is: "+div);
	}
	
	public static void main(String[] args) {
	add();
	multiply();
	Task6_3 obj=new Task6_3();
	obj.divide();

	}

}
