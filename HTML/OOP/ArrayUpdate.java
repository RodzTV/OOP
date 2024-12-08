package OOP;

import java.util.*;

public class ArrayUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Ask for the number of array elements
        System.out.print("How many number of Array Elements?: ");
        int n = scanner.nextInt();
        
        int array[] = new int[n];
        
        // Step 2: Input values for the array
        for (int i = 0; i < n; i++) {
            System.out.print("Input for Array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        
        // Step 3: Display the array values
        System.out.println("Values in the array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Value in Array[" + i + "]: " + array[i]);
        }



        int editMore = 1;
        // Step 4: Allow user to edit array elements
        while (editMore == 1) {
            System.out.println("UPDATE VALUE ARRAY ");
            
            // Ask for the index to edit
            System.out.print("Array Index to Edit: ");
            int index = scanner.nextInt();
            
            // Ask for the new element
            System.out.print("New Array Element: ");
            int newValue = scanner.nextInt();
            
            // Update the array
            if (index >= 0 && index < n) {
                array[index] = newValue;
            } else {
                System.out.println("Invalid index. Please try again.");
            }
            
            // Display the updated array values
            System.out.println("Updated values in the array:");
            for (int i = 0; i < n; i++) {
                System.out.println("Update Value in Array[" + i + "]: " + array[i]);
            }

            
            // Ask if the user wants to edit more elements
            System.out.print("Edit more elements?[1 - Yes, 0 - No]: ");
            
            editMore = scanner.nextInt();
            while (editMore != 0 && editMore != 1 ) {
                    System.out.println("Invalid input. Please enter 1 or 0.");
                    System.out.print("Edit more elements?[1 - Yes, 0 - No]: ");
                    editMore = scanner.nextInt();
            }
            
                
    
        }
        
        System.out.println("Exiting program.");
    }
}