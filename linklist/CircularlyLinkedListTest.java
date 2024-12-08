public class CircularlyLinkedListTest {
  public static void main(String[] args) {
      CircularlyLinkedList<String> flightList = new CircularlyLinkedList<>();

      flightList.addLast("LAX");
      flightList.addLast("MSP");
      flightList.addLast("ATL");
      flightList.addLast("BOS");

      System.out.println("Before rotation:");
      printList(flightList);

      System.out.println("\nAfter first rotation:");
      flightList.rotate();
      printList(flightList);

      System.out.println("\nAdding 'STL' at the front:");
      flightList.addFirst("STL");
      printList(flightList);
  }

  public static void printList(CircularlyLinkedList<String> list) {
      if (list.isEmpty()) {
          System.out.println("(empty list)");
          return;
      }
      CircularlyLinkedList.Node<String> current = list.getNext();
      do {
          System.out.print(current.getElement() + " -> ");
          current = current.getNext();
      } while (current != list.getNext());
      System.out.println("(back to head)");
  }
}
