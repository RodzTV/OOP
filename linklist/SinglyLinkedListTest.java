public class SinglyLinkedListTest {
  public static void main(String[] args) {
      SinglyLinkedList<String> flightList = new SinglyLinkedList<>();

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
  }
  
  public static void printList(SinglyLinkedList<String> list) {
      SinglyLinkedList.Node<String> current = list.head;
      while (current != null) {
          System.out.print(current.getElement() + " -> ");
          current = current.getNext();
      }
      System.out.println("null");
  }
}
