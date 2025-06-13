package theme_2;

public class Task5_3Circle {
	private int radius;
	public void setRadius(int r) {
		this.radius=r;
	}
	public int getRadius() {
		return radius;
	}
	public double calculateArea() {
		double c=3.14*radius*radius;
		return c;
	}
	public double calculatePerimeter() {
		double a=2*3.14*radius;
		return a;
	}
	public static void main(String[] args) {
		Task5_3Circle tr=new Task5_3Circle();
		tr.setRadius(33);
		System.out.println("Radius of the circle: "+tr.getRadius());
		System.out.println("Area of the circle: "+tr.calculateArea());
		System.out.println("Perimeter of the circle: "+tr.calculatePerimeter());
	}

}
