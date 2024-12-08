public class Counter {
  private int count;
// constructor (int count = 1 and count = 2)
  public Counter() {
      count = 0;
  }
//  constructor getter method
  public int getCount() {
      return count;
  }
// constructor setter method
  public void increment() {
      count++;
  }
// constructor decrement method
  public void increment(int times) {
      count += times;
  }
//  constructor getter method
  public void reset() {
      count = 0;
  }
}
