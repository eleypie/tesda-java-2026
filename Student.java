public class Student {

  String name;
  int age;

  void introduce(String greeting) {
    String school = "PUP";
    System.out.println(greeting + " " + name + " from " + school);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.name = "Loriel";
    s.age = 20;
    s.introduce("Hello");
  }
}
