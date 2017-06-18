package pack2;

public class Circle extends Shape{

	int radius;

	public Circle(int radius) {
		
		this.radius = radius;
	}
	
public void area()
{
	System.out.println("Area of Circle is :"+(3.14*radius*radius));
}
}
