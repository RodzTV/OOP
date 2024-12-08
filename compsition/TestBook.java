public class TestBook {

  public static void main(String[] args) {
    Author author1 = new Author("SIR GAYO", "wilsonGayo@gmail.com", 'M');
    System.out.println(author1);  
    Book book1 = new Book("The Great Gatsby", author1, 99.99, 100);
    System.out.println(book1);

    book1.setPrice(88.8);
    book1.setQuantity(99);

    System.out.println("name is " + book1.getName());
    System.out.println("author is " + book1.getAuthor());
    System.out.println("price is " + book1.getPrice());
    System.out.println("quantity is " + book1.getQuantity());



    Book moreDummyBook = new Book("More Dummy Book");
     new Author(null, null, 0);
      
   }   
  }