// TestCircle.java
public class TestCircle {
  public static void main(String[] args) {
      // Create some points
      Point p1 = new Point(0, 0);
      Point p2 = new Point(1, 2);
      Point p3 = new Point(4, 5);

      // Create some circles with points and radius
      Circle c1 = new Circle(1.0, p1);
      Circle c2 = new Circle(3.3, p2);
      Circle c3 = new Circle(6.6, p3);

      // Output the circle information
      System.out.println("cl: " + c1);
      System.out.println("c2: " + c2);
      System.out.println("c3: " + c3);
      
      // Test Setters and Getters of c1
      c1.setCenterXY(11, 12); // Set center to (11, 12)
      c1.setRadius(13.3); // Set radius to 13.3
      System.out.println("\ncl: " + c1); // Output updated circle
      System.out.println("cl is: " + c1.getCenter()); // Output center
      System.out.println("Radius is: " + c1.getRadius()); // Output radius
      
      // Set Center X and Y individually
      c1.setCenterX(21);
      c1.setCenterY(22);
      System.out.println("\nc1: " + c1); // Output updated circle
      System.out.println("cl's x is: " + c1.getCenterX()); // Output center X
      System.out.println("C1's y is: " + c1.getCenterY()); // Output center Y
      
      // Set Center using setCenterXY method
      c1.setCenterXY(31, 32);
      System.out.println("\nc1: " + c1); // Output updated circle
      System.out.println("cl's x is: " + c1.getCenterX()); // Output center X
      System.out.println("cl's y is: " + c1.getCenterY()); // Output center Y
      
      // Test getArea() and getCircumference()
      System.out.println("\nArea of c1: " + c1.getArea());
      System.out.println("Circumference of c1: " + c1.getCircumference());

      // Test distance between c1 and c2
      double dist = c1.distance(c2);
      System.out.println("\nDistance between c1 and c2: " + dist);
  }
}
