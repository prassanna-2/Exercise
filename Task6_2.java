package theme_2;

public class Task6_2 {
	int id;
	String name,designation;
	public Task6_2(int i) {
		id=i;
	}
	public Task6_2(int i,String n)
	{
		id=i;
		name=n;
	}
	public Task6_2(int i,String n,String d)
	{
		id=i;
		name=n;
		designation=d;
	}
	public void display() {
		System.out.println("id: "+id+" name:"+name+" designation:"+designation);
	}
	public static void main(String[] args) {
		Task6_2 ts=new Task6_2(56);
		Task6_2 ts1=new Task6_2(34,"krish");
		Task6_2  ts2=new Task6_2(27,"Ram","Maintenance");
		ts.display();
		ts1.display();
		ts2.display();

	}

}
