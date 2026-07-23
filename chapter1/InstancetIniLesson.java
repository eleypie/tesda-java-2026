package chapter1;

public class InstancetIniLesson {

  InstancetIniLesson() {
    code = 0;
  }

  int code = 1;

  {
    System.out.println(code);
  }

  public static void main(String[] args) {

    InstancetIniLesson ini = new InstancetIniLesson();
    {
      System.out.println(ini.code);
      System.out.println("feathers");

    }
  }

  {
    System.out.println("Snowy");
    code = 214234234;
    System.out.println(code);
  }
}

// Objects aren’t always last. They run exactly at the point you call new, but
// their internal steps (fields, initializers, constructor) must finish before
// execution continues in the calling method.

// So in your earlier code, "feathers" was last only because you printed it
// after creating the object. If you had printed something before new
// InstancetIniLesson(), it would have appeared earlier.