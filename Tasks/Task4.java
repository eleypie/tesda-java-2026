package Tasks;

import java.util.Scanner;

public class Task4 {

  public void isPal() {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("-------------");
      System.out.print("Input: ");
      String input = sc.nextLine();
      StringBuilder int2 = new StringBuilder(input);
      int2.reverse();
      String rev = int2.toString();

      System.out.println(
          input.equals(rev) ? "The input string is a palindrome" : "The input string is not a palindrome");
    }

  }

  public static void main(String[] args) {
    System.out.println("PALIMDROME CHECKER");
    Task4 t4 = new Task4();
    t4.isPal();
  }
}
