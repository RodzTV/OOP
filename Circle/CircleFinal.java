
public class CircleFinal {
	
	public static final double DEFAULT_RADIUS = 1.0; //final = cannot be changed
	public static final String DEFAULT_COLOR = "red"; // both of them are constants
	
	private double radius;
	private String color;
	
	public CircleFinal()
	{
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
	}
	public CircleFinal(double radius)
	{
		this.radius = radius;
		color = DEFAULT_COLOR;
	}
	public CircleFinal(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String toString()
	{
		return "Circle [raius = " + radius + ", color = " + color + "]";
	}
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	public double getCircumference()
	{
		return 2.0*Math.PI*radius;//2PIr
	}
}
