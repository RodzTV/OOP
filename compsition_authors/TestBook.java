// TestBook.java
public class TestBook {
  public static void main(String[] args) {
      // Create an author
      Author author = new Author("J.K. Rowling", "jk@rowling.com");

      // Create a book with the author and price
      Book book = new Book("Harry Potter", 29.99, author);

      // Output the book information
      System.out.println(book);
  }
}
