package chapter1;

import java.util.Random; //random is a classs

// sample file
public class Main {
  public static void main(String[] var0) {
    Toy var1 = new Toy();
    var1.name = "Rare pink";
    var1.brand = "Lab Vuvu";
    var1.price = (double) 4500.0F;
    var1.quantity = 12;
    var1.setPrice(var1.price * (double) 0.5F);
    Random r = new Random();
    System.out.println(r.nextInt(10));

  }
}

// kung ano name ng Main dito usuaaly yun tin name ng file name

class Sample1 {
  String name;

  public static void main(String[] args) {
    Sample1 obj = new Sample1();
    String name = "Loriel";
    obj.name = "loriel";
    System.out.println(obj.name);
  }
}