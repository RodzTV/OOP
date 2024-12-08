import java.util.Scanner;
public class netPay {
    static String name;
    static double hoursWorked;
    static double RATE_PER_HOUR;
    static double SSS;      
    static double TAX;
    static double PIGIBIG;
    static double totalDeduction;
    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("WHAT IS YOUR NAME? ");
        name = scanner.nextLine();
        System.out.print("WHAT IS THE NO OF THE HOURS WORKED? ");
        hoursWorked = scanner.nextDouble();
        System.out.print("WHAT IS THE RATE PER HOUR? ");
        RATE_PER_HOUR = scanner.nextDouble();
        System.out.print("WHAT IS THE SSS CONTRIBUTION? ");
        SSS = scanner.nextDouble();
        System.out.print("WHAT IS THE TAX RATE? ");
        TAX = scanner.nextDouble();
        System.out.print("WHAT IS THE PIGIBIG CONTRIBUTION? ");
        PIGIBIG = scanner.nextDouble();
        displayResult();
        scanner.close();
    }
    public static double computeGrossPay() {
        return  hoursWorked * RATE_PER_HOUR;
    }
    public static double computeDeduction() {
        return SSS + TAX + PIGIBIG;
    }
    public static double computeNetPay() {
        return computeGrossPay() - computeDeduction() ;
    }
    public static void displayResult() {
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: " + computeGrossPay());
        System.out.println("Total Deduction: " + computeDeduction());
        System.out.println("Net Pay: " + computeNetPay());
    }
} 