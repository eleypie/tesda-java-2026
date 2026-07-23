package chapter2;

public class OperatorsLesson {
  public static void main(String[] args) {
    // shift ops
    System.out.println(2 << 2);
    System.err.println(15 >>> 3);
    // 0 1 1 0
    // 8 4 2 1
    // move
    // 0 1 1 0
    // 1 0 0 0

    System.err.println(+3 + +6);
    System.err.println(+3 + -(+6));

    int a = 0;
    System.err.println(a++); // gamitin mo muna value ni a bago mag add
    System.err.println(a); //1
    System.err.println(++a); // plus muna isa bago gamitin value (2)
    System.err.println(a);
    //++pp++; not allowed
    int p = 3;
    System.err.println(++p+p++); //(1+3) + 4 = 8
    System.err.println(p); //4++
    // p = +p++;
    // ❌++p++; --p=-;
    //❌✅p=+p++; 
    System.err.println(!false)
    //(type) value or variable;

    int g = (byte) 26;
    byte w = (byte) g;
    boolean isActive = false;
    System.err.println(!!!!!!!!!!!!!isActive);
    System.out.println();
    boolean isActive2 = false, isActive3;
    isActive=isActive2=isActive3=true;
    System.out.println(isActive);
    System.out.println(isActive2);
    System.out.println(isActive3);
    

    // odd true;

    short x = 10;
    short y = 30;
    short z = (short) (x*y);
    System.err.println("z=" +z);
  }
}
