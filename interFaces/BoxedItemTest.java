
public class BoxedItemTest {
  public static void main(String[] args) {
      BoxedItem item1 = new BoxedItem("Smartphone", 30000, 15000, 500, false);
      BoxedItem item2 = new BoxedItem("Chemicals", 15000, 7500, 2000, true);

      displayBoxedItem(item1);
      displayBoxedItem(item2);
  }

  public static void displayBoxedItem(BoxedItem item) {
      System.out.println("Item Description: " + item.getDescription());
      System.out.println("List Price: " + item.getListPrice() + " cents");
      System.out.println("Lowest Price: " + item.getLowestPrice() + " cents");
      System.out.println("Weight: " + item.getWeight() + " grams");
      System.out.println("Is Hazardous: " + (item.isHazardous() ? "Yes" : "No"));
      System.out.println("Insured Value: " + item.getInsuredValue() + " cents");
      System.out.println();
  }
}
