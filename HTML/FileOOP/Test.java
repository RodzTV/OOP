import java.math.*;
import java.util.*;
/**
 * Test
 */
public class Test {

   public static void main(String[] args) {
    // Create a Scanner object to read user input
    double l = 0;
    double w = 0;
    double h = 0;
    double dimensions = 0;
    System.out.println("Enter the dimensions (L, W, H) of the rectangular prism:");
    Scanner scanner = new Scanner(System.in);
    // input the L * W * H
    System.out.print("what is the L ");
    l = scanner.nextDouble();
    System.out.print("what is the w ");
    w = scanner.nextDouble();
    System.out.print("what is the h ");
    h = scanner.nextDouble();

    dimensions = l * w * h;

    System.out.println("The volume of the rectangular prism is: " + dimensions);
   }
}