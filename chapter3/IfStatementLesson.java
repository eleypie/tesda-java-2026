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
    System.out.println("Good Afternoon");
  }
}
