public class CounterDemo {
  public static void main(String[] args) {
      Counter c = new Counter();
      System.out.println("Counter c count = " + c.getCount());
      // System print the counter 
      c.increment(2);
      System.out.println("Counter c incremented twice");
      System.out.println("Counter c count = " + c.getCount());
      // System print the counter  
      int temp = c.getCount();
      System.out.println("Created variable temp from counter c : " + temp);
      // System print the counter
      c.reset();
      System.out.println("Counter c has been reset");
      System.out.println("Counter c count = " + c.getCount());
      // System print the counter
      Counter d = new Counter();
      d.increment(5);
      System.out.println("Counter d count = " + d.getCount());
      // System print the counter
      d.increment();
      System.out.println("Counter d incremented");
      System.out.println("Counter d count = " + d.getCount());
      // System print the counter 
      Counter e = new Counter();
      e.increment(6);
      System.out.println("Counter e count = " + e.getCount());

      temp = e.getCount();
      System.out.println("Assigned variable temp from counter e : " + temp);

      e.increment(2);
      System.out.println("Counter e incremented");
      System.out.println("Counter e count = " + e.getCount());
  }
}
