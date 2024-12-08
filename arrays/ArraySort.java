public class ArraySort {
  public static void main(String[] args) {
      char[] array = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'};
      
      // Print the unsorted array
      System.out.println("Unsorted array: " + Arrays.toString(array));

      // Sorting the array using a simple sort (insertion sort-like)
      for (int i = 1; i < array.length; i++) {
          char key = array[i];
          int j = i - 1;
          // Shift larger elements to the right
          while (j >= 0 && array[j] > key) {
              array[j + 1] = array[j];
              j = j - 1;
          }
          array[j + 1] = key;

          // Print current step
          System.out.println("cur: " + key + " " + Arrays.toString(array));
      }

      // Print the sorted array
      System.out.println("\nSorted array: " + Arrays.toString(array));
  }
}
