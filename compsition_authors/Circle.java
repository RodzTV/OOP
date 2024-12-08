// Circle.java
public class Circle {
  private double radius;
  private Point center;

  // Constructor
  public Circle(double radius, Point center) {
      this.radius = radius;
      this.center = center;
  }

  // Getter and setter for radius
  public double getRadius() {
      return radius;
  }

  public void setRadius(double radius) {
      this.radius = radius;
  }

  // Getter and setter for center
  public Point getCenter() {
      return center;
  }

  public void setCenter(Point center) {
      this.center = center;
  }

  // Getters and setters for x and y of center
  public double getCenterX() {
      return center.getX();
  }

  public void setCenterX(double x) {
      center.setX(x);
  }

  public double getCenterY() {
      return center.getY();
  }

  public void setCenterY(double y) {
      center.setY(y);
  }

  // Set center using x and y
  public void setCenterXY(double x, double y) {
      center.setX(x);
      center.setY(y);
  }

  // toString method
  public String toString() {
      return "Circle[center=" + center.toString() + ",radius=" + radius + "]";
  }

  // Method to calculate distance between centers of two circles
  public double distance(Circle another) {
      double dx = this.center.getX() - another.center.getX();
      double dy = this.center.getY() - another.center.getY();
      return Math.sqrt(dx * dx + dy * dy);
  }

  // Method to calculate the area of the circle
  public double getArea() {
      return Math.PI * radius * radius;
  }

  // Method to calculate the circumference of the circle
  public double getCircumference() {
      return 2 * Math.PI * radius;
  }
}
