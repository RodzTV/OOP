// BoxedItem.java
public class BoxedItem implements Sellable, Transportable {
  private String description;
  private int listPrice;
  private int lowestPrice;
  private int weight;
  private boolean hazardous;

  public BoxedItem(String description, int listPrice, int lowestPrice, int weight, boolean hazardous) {
      this.description = description;
      this.listPrice = listPrice;
      this.lowestPrice = lowestPrice;
      this.weight = weight;
      this.hazardous = hazardous;
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

  @Override
  public int getWeight() {
      return weight;
  }

  @Override
  public boolean isHazardous() {
      return hazardous;
  }
  
  public int getInsuredValue() {
      return listPrice * 2; // Example calculation for insured value
  }
}
