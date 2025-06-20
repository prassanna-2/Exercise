package Theme_3;
//Write a Java program to create a class called Employee with methods called work() and getSalary().
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee()
class Employee{
	public void work() {
		System.out.println("The job is to look over tasks given");
	}
	public void getSalary() {
		System.out.println("The salary given to this work is acceptable");
	}
}
class HRManager extends Employee{
	public void work() {
		System.out.println("The tasks given by hr is important");
	}
	public void addEmployee() {
		System.out.println("The new employee should learn the rules ");
	}
}

public class Task8_1 {

	public static void main(String[] args) {
		HRManager hr=new HRManager();
		hr.work();

	}

}
