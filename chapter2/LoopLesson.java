package chapter2;

import java.util.Scanner;

public class LoopLesson {
  static boolean op() {
    return true;
  }

  public static void main(String[] args) {
    byte a = 1;
    while (a <= 10) // false walang gagawin
      System.out.println("a = " + a++);
    // System.out.println("end of program");

    do
      System.out.println("do while : a = " + a--);
    while (a < 0);
    System.out.println("end of program");

    for (int b = 0; b < 10; b++)
      // for (int b = 0; b < 10; ) allowed
      /*
       * int b = 0
       * for (; b < 10; b++)
       */
      // for (;; ) infinite loop
      System.out.println("b = " + b++);

    /*
     * int b = 0;
     * boolean bol = true;
     * for (; bol;)
     * System.out.println("b = " + b++);
     * for (System.out.println("Initialization"); b < 10;
     * System.out.println("update statement"))
     * System.out.println("b = " + b++);
     */

    System.out.println("enter a valid number");
    Scanner q = new Scanner(System.in);
    int limit = q.nextInt();
    for (int x = 1; x < limit; x++) {
      for (int y = 1; y <= x; y++) {
        System.out.print(x);
      }
      System.out.println();

    }

    String[] colors = { "black", "red", "pink", "yellow", "white", "blue" };
    for (String color : colors)
      System.out.println("Color: " + color);

    /*
     * ROW: for (int p = 1; p <= 10; p++) {
     * COL: for (int l = 1; l <= 10; l++) {
     * System.out.print(l * p + "\t");
     * }
     * System.out.println();
     * 
     * }
     */

    ROW_TABLE: for (int p = 1; p <= 10; p++) {
      COL_TABLE: for (int l = 1; l <= 10; l++) {
        if (l == 5)
          // break ROW_TABLE;
          continue ROW_TABLE;
        System.out.print(l * p + "\t");
      }
      System.out.println();

    }
  }
}
