import java.util.Scanner;

public class prac3 {

  public static void greeting(String hello) {
    String greet = "Hello, ";
    System.out.println(greet + hello);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();

    greeting(name);
  }
}