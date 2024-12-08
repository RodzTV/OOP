// PhotographTest.java
public class PhotographTest {
  public static void main(String[] args) {
      Photograph photo1 = new Photograph("Sunset over the mountains", 5000, 2500, true);
      Photograph photo2 = new Photograph("Black and white portrait", 3000, 1500, false);

      displayPhotograph(photo1);
      displayPhotograph(photo2);
  }

  public static void displayPhotograph(Photograph photo) {
      System.out.println("Item Description: " + photo.getDescription());
      System.out.println("List Price: " + photo.getListPrice() + " cents");
      System.out.println("Lowest Price: " + photo.getLowestPrice() + " cents");
      System.out.println("Is the photograph in color? " + (photo.isColor() ? "Yes" : "No"));
      System.out.println();
  }
}
