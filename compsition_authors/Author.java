  // Author.java
public class Author {
  private String name;
  private String email;

  // Constructor
  public Author(String name, String email) {
      this.name = name;
      this.email = email;
  }

  // Getters and setters
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  // toString method
  public String toString() {
      return "Author[name=" + name + ", email=" + email + "]";
  }
}
