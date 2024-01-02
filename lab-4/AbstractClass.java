import java.util.Scanner;
abstract class Shape{
	double a;
	double b;
	Shape(double d1,double d2){
		this.a = d1;
		this.b = d2;
	}
	abstract double area();

}
class Rectangle extends Shape{
	Rectangle(double d1,double d2){
		super(d1,d2);
	}
	double area(){
		System.out.print("area of rectangle = ");
		return a*b;
	}
}
class Triangle extends Shape{
	Triangle(double d1,double d2){
		super(d1,d2);
	}
	double area(){
		System.out.print("area of Triangle = ");
		return (a*b)/2;
	}
}
class Circle extends Shape{
	Circle(double r){
		super(r,0);
	}
	double area(){
		System.out.print("area of Circle = ");
		return 3.14*a*a;
	}
}

class AbstractClass{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.println("enter the dimensions of rectangle(length and breadth)");
		int length = in.nextInt();
		int breadth = in.nextInt();

		System.out.println("enter the dimensions of triangle(base and height)");
		int base = in.nextInt();
		int height = in.nextInt();

		System.out.println("enter the dimensions of rectangle(radius)");
		int radius = in.nextInt();

		Rectangle r = new Rectangle(length,breadth);
      		Triangle t = new Triangle(base,height);
		Circle c = new Circle(radius);

		System.out.println(r.area());
		System.out.println(t.area());
		System.out.println(c.area());
	
	}
}