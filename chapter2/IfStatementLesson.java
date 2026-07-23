package chapter3;

public class IfStatementLesson {
  public static void main(String[] args) {
    int hourOfDay = 10;
    if (hourOfDay < 11)
      // if true both are printed, if false last statement only
      System.out.println("Good morning");
    System.out.println("Kumain kana ba?");

    // if else
    if (hourOfDay < 11)
      System.out.println("Good morning");
    else
      System.out.println("Good Afternoon");
    // but since we dont have curly brace statement below is printed
    System.out.println("Good Afternoon");

    // if, else if, else
    // This is a shortcut condition, so you don’t need to rely on a long algorithm.
    // It follows a bigger-to-smaller approach.
    if (hourOfDay < 18)
      System.out.println("Good eve");
    else if (hourOfDay <= 12)
      System.out.println("good afternoon");
    else
      System.out.println("Good morning");

    // Nested if: An if statement inside another if statement.
    // If possible, avoid deeply nested if statements to keep the code simple and
    // readable.
    // Try to limit nesting to 2 levels, or 3 levels at most.

    // Ternary operator: (boolean expression) ? T : F;
    // If the boolean expression is true, T is returned; otherwise, F is returned.
    // The ternary operator can be used as a shorter alternative to a simple if-else
    // statement.

    System.out.println((hourOfDay <= 18) ? "Good Eve" : "Good Day");
  }
}
