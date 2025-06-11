package theme_2;

public class Task4_1 {
	int id;
	String name;
	String designation;
	String location;
	public Task4_1(int i,String n,String d,String l)
	{
		id=i;
		name=n;
		designation=d;
		location=l;
	}
	public void display()
	{
		System.out.println("id:"+id+" name:"+name+" designation:"+designation+" location:"+location);
	}
	public static void main(String[] args) {
		Task4_1 tr=new Task4_1(1,"Rahul","Manager","chennai");
		Task4_1 tr1=new Task4_1(2,"Krish","CEO","Madurai");
		tr.display();
		tr1.display();
		
	}

}
