package theme_2;

public class Task5_1 {
	private int employee_id;
	private String employee_name;
	private String employee_location; 
	public String getName() {
		return employee_name;
	}
	public int getId() {
		return employee_id;
	}
	public String getLocation() {
		return employee_location;
	}
	public void setName(int id,String name,String location)
	{
		this.employee_id=id;
		this.employee_name=name;
		this.employee_location=location;
	}
	public static void main(String[] args) {
		Task5_1 ts=new Task5_1();
		ts.setName(1,"Krish","chennai");
		System.out.println("EmployeeId: "+ts.getId());
		System.out.println("EmployeeName: "+ts.getName());
		System.out.println("EmployeeLocation: "+ts.getLocation());
	}

}
