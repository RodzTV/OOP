// Point.java
public class Point {
  private double x;
  private double y;

  // Constructor
  public Point(double x, double y) {
      this.x = x;
      this.y = y;
  }

  // Getters and setters
  public double getX() {
      return x;
  }

  public void setX(double x) {
      this.x = x;
  }

  public double getY() {
      return y;
  }

  public void setY(double y) {
      this.y = y;
  }

  // toString() method
  public String toString() {
      return "(" + x + "," + y + ")";
  }
}
