package Tasks.Task11;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Java Programming", "John Smith", 2021, 39.99));
    books.add(new Book("Python Basics", "Jane Doe", 2020, 29.99));
    books.add(new Book("C++ Essentials", "Michael Johnson", 2019, 49.99));

    int i = 1;
    for (Book b : books) {
      System.out.println("\nBook " + i + ":" + b);
      i++;
    }

  }

}
