/**
 * 
 * Toy object
 * has property of name, branc, price, quantity
 * with a method of setPrice() weher you can change 
 * the price stae of Toy object
 */

package chapter1; //this is important so when you use the fields here in the sunflower it will work

public class Toy {
  String name;
  String brand;
  double price;
  int quantity;

  void setPrice(double price) { // double price is a parameter
    this.price = price; // referring to the price above

  }

  public static void main(String[] args) {
    Toy toy1 = new Toy();
    toy1.name = "Rare pink";
    toy1.brand = "Lab Vuvu";
    toy1.price = 4500;
    toy1.quantity = 12;
    toy1.setPrice((toy1.price * 0.5));
    System.out.println(toy1.price);
  }
}
