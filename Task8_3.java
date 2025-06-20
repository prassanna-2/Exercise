package Theme_3;
//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
//Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area 
//and perimeter of a circle
import java.util.*;

 class Shape
{
	public double getPerimeter()
	{
		return 0;
	}
	public double getArea()
	{
		return 0;
	}
}
class Circle extends Shape
{
	float radius;
	public Circle(float radius)
	{
		this.radius=radius;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
}
public class Task8_3 {

	public static void main(String[] args) {
		Circle c=new Circle(6);
		System.out.println("radius of the circle is:"+6);
		System.out.println("Perimeter of the circle is:"+c.getPerimeter());
		System.out.println("Area of the Circle is:"+c.getArea());

	}

}
