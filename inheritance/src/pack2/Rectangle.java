package pack2;

public class Rectangle extends Shape {
	int length,breadth;

	
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}



	public void area()
	{
		System.out.println("Area of Rectangle is"+(length*breadth));
		
	}

}
