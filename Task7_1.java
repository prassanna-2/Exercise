package theme_2;

public class Task7_1 {
	int id;
	String name;
	int age;
	public void employee(int i,String n) {
		this.id=i;
		this.name=n;
	}
	public void employee(int i,String n,int a)
	{
		this.id=i;
		this.name=n;
		this.age=a;
	}
	public void display1()
	{
		System.out.println("id: "+id+" "+"name: "+name);
	}
	public void display2() {
		System.out.println("id: "+id+" "+"name: "+name+" age:"+age);
	}
	public static void main(String[] args) {
		Task7_1 ts=new Task7_1();
		ts.employee(5,"Krish");
		ts.display1();
		ts.employee(6,"Harish",25);
		ts.display2();

	}

}
