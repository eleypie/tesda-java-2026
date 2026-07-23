public class prac1 {
  String name;
  int age;
  String course;

  void information(String student, int batch) {
    // int batch2 = 2025;
    // String greet2 = "Hi";
    System.out
        .println(student + " " + name + "," + " " + age + ", " + "studying " + course + " from PUP, batch " + batch);
  }

  public static void main(String[] args) {
    prac1 s1 = new prac1();
    s1.name = "Loriel";
    s1.age = 20;
    s1.course = "Computer Science";
    s1.information("Hello", 2025);

    prac1 s2 = new prac1();
    s2.name = "Ana";
    s2.age = 21;
    s2.course = "Information Technology";
    s2.information("Hi", 2026);
  }
}

class conflic {
  public static void main(String[] args) {
    java.util.Date date;
    java.sql.Date sqlDate;
    System.out.println();
  }

}