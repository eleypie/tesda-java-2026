package Tasks;

import java.util.Scanner;

public class Task7 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return (a - b);
    }

    public int multiply(int a, int b) {
        return (a * b);
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return (a / b);

    }

    public static void main(String[] args) {
        Task7 t7 = new Task7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        t7.add(a, b);
        t7.subtract(a, b);
        t7.multiply(a, b);
        t7.divide(a, b);
        System.out.println("Sum: " + t7.add(a, b));
        System.out.println("Difference: " + t7.subtract(a, b));
        System.out.println("Product: " + t7.multiply(a, b));
        System.out.println("Quotient: " + t7.divide(a, b));
    }
}