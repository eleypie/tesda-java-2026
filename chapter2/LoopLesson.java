package chapter2;

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

    int b = 0;
    boolean bol = true;
    for (; bol;)
      System.out.println("b = " + b++);
    for (System.out.println("Initialization"); b < 10; System.out.println("update statement"))
      System.out.println("b = " + b++);

  }
}
