public class GameEntry {
  private String name;
  private int score;

  // Constructor
  public GameEntry(String name, int score) {
      this.name = name;
      this.score = score;
  }

  // Getter methods
  public String getName() {
      return name;
  }

  public int getScore() {
      return score;
  }

  @Override
  public String toString() {
      return name + ": " + score;
  }
}

