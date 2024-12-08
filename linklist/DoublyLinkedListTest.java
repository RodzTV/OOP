public class DoublyLinkedListTest {
  public static void main(String[] args) {
      DoublyLinkedList<String> flightList = new DoublyLinkedList<>();

      flightList.addLast("MSP");
      flightList.addLast("ATL");
      flightList.addLast("BOS");

      System.out.println("Initial flight list:");
      printList(flightList);

      System.out.println("\nInserting 'LAX' at the head:");
      flightList.addFirst("LAX");
      printList(flightList);

      System.out.println("\nInserting 'MIA' at the tail:");
      flightList.addLast("MIA");
      printList(flightList);

      System.out.println("\nRemoving the head ('LAX'):");
      flightList.removeFirst();
      printList(flightList);

      System.out.println("\nRemoving the tail ('MIA'):");
      flightList.removeLast();
      printList(flightList);
  }

  public static void printList(DoublyLinkedList<String> list) {
      DoublyLinkedList.Node<String> current = list.getNext();
      while (current != list) {
          System.out.print(current.getElement() + " <-> ");
          current = current.getNext();
      }
      System.out.println("null");
  }
}
