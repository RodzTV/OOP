
public class TestCircleFinal {
	public static void main(String[] args)
	{
		CircleFinal c1 = new CircleFinal(1.1, "blue");
		System.out.println(c1);
		
		CircleFinal c2 = new CircleFinal(2.2);
		System.out.println(c2);
		
		CircleFinal c3 = new CircleFinal();
		System.out.println(c3);
		
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println(c1);
		
		System.out.println("The radius is: "+c1.getRadius());
		System.out.println("The color is: "+c1.getColor());
		System.out.printf("The area is: %.2f%n",c1.getArea());
		System.out.printf("The area is: %.2f%n",c1.getCircumference());
	}
}
