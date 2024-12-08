// Photograph.java
public class Photograph implements Sellable {
  
  private String description;
  private int listPrice;
  private int lowestPrice;
  private boolean isColor;

  public Photograph(String description, int listPrice, int lowestPrice, boolean isColor) {
      this.description = description;
      this.listPrice = listPrice;
      this.lowestPrice = lowestPrice;
      this.isColor = isColor;
  }

  @Override
  public String getDescription() {
      return description;
  }

  @Override
  public int getListPrice() {
      return listPrice;
  }

  @Override
  public int getLowestPrice() {
      return lowestPrice;
  }

  public boolean isColor() {
      return isColor;
  }
}
