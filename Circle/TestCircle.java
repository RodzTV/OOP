
public class TestCircle {
	public static void main(String []args) //don't forget main or your output will be in red
	{
	Circle c1 = new Circle(2.0, "blue");
	
	System.out.println("The radius is: "+c1.getRadius());
	System.out.println("The color is: "+c1.getColor());
	System.out.printf("The area is: %.2f\n", c1.getArea());
	System.out.println();
	
	Circle c2 = new Circle(2.0, "red");
	
	System.out.println("The radius is: "+c2.getRadius());
	System.out.println("The color is: "+c2.getColor());
	System.out.printf("The area is: %.2f\n",c2.getArea());
	System.out.println();
	
	Circle c3 = new Circle(1.0, "red");
	
	System.out.println("The radius is: "+c3.getRadius());
	System.out.println("The color is: "+c3.getColor());
	System.out.printf("The area is: %.2f\n", c3.getArea()); //use printf and use comma or you'll get error
	System.out.println();
	
	}
}
