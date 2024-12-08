public class Point3D extends Point2D {
  private int z;

  // Default constructor
  public Point3D() {
      super(); // Calls the default constructor of Point2D
      this.z = 0;
  }

  // Parameterized constructor
  public Point3D(int x, int y, int z) {
      super(x, y); // Calls the parameterized constructor of Point2D
      this.z = z;
  }

  // Getter for z
  public int getZ() {
      return this.z;
  }

  // Setter for z
  public void setZ(int z) {
      this.z = z;
  }

  // Override toString to include z coordinate
  @Override
  public String toString() {
      return "(" + getX() + ", " + getY() + ", " + this.z + ")";
  }
}
