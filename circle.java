import java.util.*;


public class Circle {
    public static double circle, diameter,area,circumference;
    public static double radius;
    public static double bi = 3.1416;
        
    public static double computeDiameter(double radius){
        diameter = radius * 2;
        return diameter;
    }
    public static double computeArea(double radius){
        area = bi * (radius * radius);
        return area;
    }
    public static double computeCircumference(double radius){
        circumference = 2 * bi * radius;
        return circumference;
    }  
    public static void displayValue(){
        System.out.println("Diameter :"+ computeDiameter(radius));
        System.out.println("Area :"+computeArea(radius) ); 
        System.out.printf("circumference:"+ (computeCircumference(radius)));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the Radius of a Circle");
        radius = scan.nextDouble();
        displayValue();
    }

}
