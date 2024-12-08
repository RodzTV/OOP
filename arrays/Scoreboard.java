import java.util.Arrays;

public class Scoreboard {
    private GameEntry[] board;
    private int size;

    // Constructor
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
        size = 0;
    }

    // Add a new GameEntry
    public void add(GameEntry entry) {
        if (size < board.length) {
            board[size] = entry;
            size++;
            Arrays.sort(board, 0, size, (e1, e2) -> Integer.compare(e2.getScore(), e1.getScore()));
        } else {
            System.out.println("Scoreboard is full!");
        }
    }

    // Remove a GameEntry by name
    public void remove(String name) {
        for (int i = 0; i < size; i++) {
            if (board[i].getName().equals(name)) {
                System.arraycopy(board, i + 1, board, i, size - i - 1);
                board[size - 1] = null;
                size--;
                break;
            }
        }
    }

    // Print the scoreboard
    public void printScoreboard() {
        for (int i = 0; i < size; i++) {
            System.out.println(board[i]);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard(6);

        // Initial Entries
        scoreboard.add(new GameEntry("Mike", 1105));
        scoreboard.add(new GameEntry("Rob", 750));
        scoreboard.add(new GameEntry("Paul", 720));
        scoreboard.add(new GameEntry("Anna", 660));
        scoreboard.add(new GameEntry("Rose", 590));
        scoreboard.add(new GameEntry("Jack", 510));

        System.out.println("Initial Scoreboard:");
        scoreboard.printScoreboard();

        // Inserting Jill
        System.out.println("\nScoreboard after inserting Jill:");
        scoreboard.add(new GameEntry("Jill", 740));
        scoreboard.printScoreboard();

        // Removing Paul
        System.out.println("\nScoreboard after removing Paul:");
        scoreboard.remove("Paul");
        scoreboard.printScoreboard();
    }
}
