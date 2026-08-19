package Tasks.Task11;

import java.text.NumberFormat;

public class Book {
  String title;
  String author;
  int yearPublished;
  double price;

  public Book(String title, String author, int yearPublished, double price) {
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
    this.price = price;
  }

  @Override
  public String toString() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return "\nTitle: " + "\"" + title + "\"" +
        "\nAuthor: " + "\"" + author + "\"" +
        "\nYear Published: " + yearPublished +
        "\nPrice: " + (fmt.format(price));
  }
}
