// Book.java
public class Book {
  private String title;
  private double price;
  private Author author;

  // Constructor
  public Book(String title, double price, Author author) {
      this.title = title;
      this.price = price;
      this.author = author;
  }

  // Getters and setters
  public String getTitle() {
      return title;
  }

  public void setTitle(String title) {
      this.title = title;
  }

  public double getPrice() {
      return price;
  }

  public void setPrice(double price) {
      this.price = price;
  }

  public Author getAuthor() {
      return author;
  }

  public void setAuthor(Author author) {
      this.author = author;
  }

  // toString method
  public String toString() {
      return "Book[title=" + title + ", price=" + price + ", " + author.toString() + "]";
  }
}
