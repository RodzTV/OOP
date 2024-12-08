    import java.util.*;
    /*
    * even
    * odd
    * sum
    * smallest
    * largest
    */
    public class myArray {
        static int numElements;
        static int i;
        static int[] arr;
        static int isEVEN = 0;
        static int isODD = 0;
        static int sum = 0;
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int numElements = scanner.nextInt();
            int[] arr = new int[numElements];
            for (int i = 0; i < numElements; i++) {
                System.out.print("Array ["+i+"]: ");
                arr[i] = scanner.nextInt(); 
            }  
             
            // odd and even
             if(arr[i] % 2 == 0){
                isEVEN++;
            } else {
                isODD++;
            }
            // sum
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i];
            }
            // smallest and largest
            int smallest = arr[0];
            int largest = arr[0];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < smallest){
                    smallest = arr[j];
                }
                if(arr[j] > largest){
                    largest = arr[j];
                }
            }
            //print they all 
            System.out.println("The value in Indexs  " + i + " is " +  +arr[i] +"  \n" );
            System.out.println("The Sum of all Element is "+sum);
            System.out.println("The Smallest number is "+smallest);
            System.out.println("The Largest number is "+largest);
            System.out.println("The Number of Even numbers is "+isEVEN);
            System.out.println("The Number of Odd numbers is "+isODD);
            // clear for next number
        }
    }