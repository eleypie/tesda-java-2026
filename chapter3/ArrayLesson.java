package chapter3;

import java.util.Arrays;

public class ArrayLesson {
  public static void main(String[] args) {
    int[] i = new int[3];
    int[] numbers2 = new int[] { 1, 54, 75 };
    int[] numbers3 = { 1, 54, 75 };
    Student[] batch2 = { new Student(), new Student(), new Student(), new Student() };

    for (int j = 0; j <= numbers3.length; j++)
      System.out.println(numbers3[j]);

    // SORTING
    // int[] numbers4={1, 54, 75, 5, 76, 34, 7, 3, 8, 10, 34};
    // Arrays.sort(numbers4);
    String[] numbersString = { "1", "54", "7", " 5", "76", "34", "7", "3", "8", "10", "34" };
    Arrays.sort(numbersString);
    for (String numberString : numbersString)
      System.out.println(numberString + ", ");
    System.out.println();

    // Search
    int searchNum = 34;
    System.out.println("\n" + searchNum + "search result:" + Arrays.binarySearch(numbersString, 1));
    Arrays.sort(numbersString);
    for (String numberString : numbersString)
      System.out.print(numberString + ",");
    System.out.println();

  }
}

class Student {
  String fullname;
  int age;
}
