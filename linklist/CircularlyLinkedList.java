public class CircularlyLinkedList<E> {
  private static class Node<E> {
      private E element;
      private Node<E> next;

      public Node(E element, Node<E> next) {
          this.element = element;
          this.next = next;
      }

      public E getElement() {
          return element;
      }

      public Node<E> getNext() {
          return next;
      }

      public void setNext(Node<E> next) {
          this.next = next;
      }
  }

  Node<E> tail = null;
  private int size = 0;

  public CircularlyLinkedList() {}

  public int size() {
      return size;
  }

  public boolean isEmpty() {
      return size == 0;
  }

  public E first() {
      return isEmpty() ? null : tail.getNext().getElement();
  }

  public E last() {
      return isEmpty() ? null : tail.getElement();
  }

  public void rotate() {
      if (tail != null) {
          tail = tail.getNext();
      }
  }

  public void addFirst(E element) {
      if (isEmpty()) {
          tail = new Node<>(element, null);
          tail.setNext(tail);
      } else {
          Node<E> newNode = new Node<>(element, tail.getNext());
          tail.setNext(newNode);
      }
      size++;
  }

  public void addLast(E element) {
      addFirst(element);
      tail = tail.getNext();
  }

  public E removeFirst() {
      if (isEmpty()) return null;
      Node<E> head = tail.getNext();
      if (head == tail) {
          tail = null;
      } else {
          tail.setNext(head.getNext());
      }
      size--;
      return head.getElement();
  }
}
