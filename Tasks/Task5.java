package Tasks;

import java.util.Scanner;

public class Task5 {

  public void largestNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("(1) First Input: ");
    int firstInt = sc.nextInt();
    System.out.print("(2) Second Input: ");
    int secInt = sc.nextInt();
    System.out.print("(3) Third Input: ");
    int thirdInt = sc.nextInt();

    int largest = 0;
    if (firstInt > secInt) {
      largest = firstInt;
    }

    if (thirdInt > largest) {
      largest = thirdInt;
    }

    if (firstInt == secInt && secInt == thirdInt) {
      System.out.println("== All numbers are equal ==");
    } else {
      System.out.println("Largest Number is: " + largest);
    }

  }

  public static void main(String[] args) {
    Task5 t5 = new Task5();
    System.out.println("Enter 3 inputs");
    t5.largestNum();
  }
}
