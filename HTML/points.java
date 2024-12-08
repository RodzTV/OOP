
import java.util.*;

public class points{

  static public void pattern1(){
    /*
* 
* *
* * *
* * * *
* * * * *
     */
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
          System.out.print("*");
      }
      System.out.println();
  }
  }
  public static void pattern2(){
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
          System.out.print("*");
         }
      System.out.println();
       }
  }
  public static void pattern3(){
    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j >= i; j--) {
          System.out.print("*");
      }
      System.out.println();
  }
  
  }
  public static void pattern4(){
    int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = n; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}

  }
  public static void pattern5(){
    int n = 5;
for (int i = n; i >= 1; i--) {
    for (int j = n; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print("*");
    }
    System.out.println();
}

  }
  public static void pattern6(){
    int p_height = 5;
for (int i = 1; i <= p_height; i++) {
    for (int k = p_height; k > i; k--) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

  }
  public static void pattern7(){
    int p_height = 5;
for (int i = p_height; i >= 1; i--) {
    for (int k = p_height; k > i; k--) {
        System.out.print(" ");
    }
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}

  }
  public static void pattern8(){
    int p_height = 5;
int min_stars = 1;
for (int i = 0; i < p_height; i++) {
    for (int j = p_height; j > i; j--) {
        System.out.print(" ");
    }
    for (int k = 0; k < min_stars; k++) {
        System.out.print("*");
    }
    min_stars += 2;
    System.out.println();
}

  }
  public static void pattern9(){
    int p_height = 5;
int max_stars = p_height * 2 - 1;
int p_space = p_height - 1;
for (int i = p_height; i >= 1; i--) {
    for (int j = p_space; j >= i; j--) {
        System.out.print(" ");
    }
    for (int k = 1; k <= max_stars; k++) {
        System.out.print("*");
    }
    max_stars -= 2;
    System.out.println();
}

  }
  public static void pattern10(){
    int size = 3;
for (int i = size; i >= -size; i--) {
    for (int j = size; j >= Math.abs(i); j--) {
        System.out.print("*");
    }
    System.out.println();
}

  }
  public static void pattern11(){
    int size = 3;
for (int i = size; i >= -size; i--) {
    for (int j = 1; j <= Math.abs(i); j++) {
        System.out.print(" ");
    }
    for (int k = size; k >= Math.abs(i); k--) {
        System.out.print("*");
    }
    System.out.println();
}

  }
  public static void main(String[] args){
    pattern1();
    System.out.println("-----------------------------------");  // print separator line
    pattern2();
    System.out.println("-----------------------------------");  // print separator line
    pattern3();
    System.out.println("-----------------------------------");  // print separator line
    pattern4();
    System.out.println("-----------------------------------");  // print separator line
    pattern5();
    System.out.println("-----------------------------------");  // print separator line
    pattern6();
    System.out.println("-----------------------------------");  // print separator line
    pattern7();
    System.out.println("-----------------------------------");  // print separator line
    pattern8();
    System.out.println("-----------------------------------");  // print separator line
    pattern9();
    System.out.println("-----------------------------------");  // print separator line
    pattern10();
    System.out.println("-----------------------------------");  // print separator line
    pattern11();
    System.out.println("-----------------------------------");  // print separator line

  }
}