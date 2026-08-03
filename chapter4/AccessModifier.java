package chapter4;

public class AccessModifier {
  public void greetMe() {
    System.out.println("Hello from JAVA people");
  }

  private void greetMe2() {
    System.out.println("Hello from JAVA person");
  }

  protected void greetMe3() {
    System.out.println("Hello from JAVA protected person");
  }

  public static void main(String[] args) {
    AccessModifier acm1 = new AccessModifier();
    acm1.greetMe();
    acm1.greetMe2();
  }
}

class ClassZ {
  public static void main(String[] args) {
    AccessModifier acm1 = new AccessModifier();
    acm1.greetMe();
    // acm1.greetMe2();
    acm1.greetMe3();
  }
}

class MoonFlower extends AccessModifier {
  public static void main(String[] args) {
    MoonFlower mf = new MoonFlower();
    mf.greetMe();
    mf.greetMe3();
  }
}