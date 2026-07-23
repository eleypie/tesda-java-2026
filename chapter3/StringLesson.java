package chapter3;

public class StringLesson {
  public static void main(String[] args) {
    String name = "fluffy";
    /*
     * Strings in Java are immutable.
     * Assigning a new value to a String variable (like 'pull') does not change the
     * original object’s address.
     * Instead, it points to a new String.
     * If the String you create already exists in the String pool, Java will reuse
     * it rather than create a new one.
     */

    String a = "1";
    a = "0";
    a += "2";
    a += "3";
    String b = "b";
    String name2 = "fluffy";
    name = null;
    name2 = null;
    String name3 = new String("fluffy");
    System.out.println(a);
    String word1 = "Stand alone";
    System.out.println(word1.toUpperCase());
    word1 = word1.toUpperCase();
    System.out.println(word1.toLowerCase());
    System.out.println(word1);
    String trimSample = " \t \n \t Marc Yam \t \n";
    System.out.println(trimSample.trim());

  }
}
