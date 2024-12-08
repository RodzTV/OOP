public class TestAuthor{
  public static void main(String[] args) {
    Author author1 = new Author("SIR GAYO", "wilsonGayo@gmail.com", 'M');
    System.out.println(author1);

    author1.setEmail("wilson@gmail.com");
    System.out.println(author1);
    
    System.out.println("name is " + author1.getName());
    System.out.println("email is " + author1.getEmail());
    System.out.println("gender is " + author1.getGender());
  }
}