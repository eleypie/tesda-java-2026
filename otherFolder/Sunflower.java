package otherFolder;

import chapter1.Toy; // here is the iumport
import chapter4.AccessModifier;

public class Sunflower {
  public static void main(String[] args) {
    Toy toy1 = new Toy(); // import it first
    System.out.println(toy1);
    AccessModifier acm1 = new AccessModifier();
    acm1.greetMe();
    // acm1.greetMe2();
    // acm1.greetMe3();
    // acm1.greetMe4();
  }
}
