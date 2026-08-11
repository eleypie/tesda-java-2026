package Tasks;

public class Task8 {

  public void computeParam(int... numbers) {
    int comulativeSum = 0;

    for (int p : numbers) {
      int sum = (p * (p + 1)) / 2;
      comulativeSum += sum;
      System.out.println("Parameter" + p + "sum = " + sum + ", cumulative sum =" + comulativeSum);
    }

  }

  public static void main(String[] args) {
    Task8 t8 = new Task8();
    System.out.println("Input:");
    System.out.println("sumOfSums(4,5,10)");
    t8.computeParam(4, 5, 10);
  }
}
