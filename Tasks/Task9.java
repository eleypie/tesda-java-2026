package Tasks;

public class Task9 {
  public static int add(int a, int b) {
    return Math.addExact(a, b);
  }

  public static int subtract(int a, int b) {
    return Math.subtractExact(a, b);
  }

  public static int multiply(int a, int b) {
    return Math.multiplyExact(a, b);
  }

  public static float divide(int a, int b) {
    return Math.floorDiv(a, b);
  }

  public static void main(String[] args) {
    System.out.println("Input:");
    System.out.println("add(10, 5) \nsubtract(10, 5) \nmultiply(10, 5) \ndivide(10, 5)");
    System.out.println("\nOutput");
    System.out.println("Sum: " + Task9.add(10, 5));
    System.out.println("Difference: " + Task9.subtract(10, 5));
    System.out.println("Product: " + Task9.multiply(10, 5));
    System.out.println("Qoutient: " + Task9.divide(10, 5));
  }
}
