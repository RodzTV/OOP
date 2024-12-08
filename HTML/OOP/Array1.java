package OOP;

import java.util.*;

public class Array1{
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("How many number of Array Elements?: ");
    int n = scanner.nextInt();

    int array[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Input for Array ["+i+"]");
      array[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      System.out.println("Value in Aarry["+i+"]:"+array[i]);
    }
    // SORT ARRAY
    // Collections.reverseOrder()
    Arrays.sort(array);
    for (int i = 0; i < n; i++) {
        // sort array
        System.out.println("Value in Sorted Array["+i+"]:"+array[i]);
    }

    System.out.println("xxxx UPDATE ARRAY xxxx");
    int edit = 1;
    while (edit == 1) {
        // update 
        System.out.println("what Array index to Edit ?");
        int index = scanner.nextInt();
        System.out.println("Enter new value:");
        int newValue = scanner.nextInt();

      if(index > 0 && index < n){
        array[index] = newValue;
        System.out.println("Array updated successfully");
      }else{
        System.out.println("Invalid index. Please try again.");
      }
      // display new update array
      for (int i = 0; i < n; i++) {
        System.out.println("Value in Updated Array["+i+"]:"+array[i]);
      }
      while (edit != 0 && edit != 1 ) {
        System.out.println("Invalid input. Please enter 1 or 0.");
        System.out.print("Edit more elements?[1 - Yes, 0 - No]: ");
        edit = scanner.nextInt();
      }
    } 
  }
}
