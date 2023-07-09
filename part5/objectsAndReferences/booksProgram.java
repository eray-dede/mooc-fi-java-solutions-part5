package part5.objectsAndReferences;

import java.util.ArrayList;
import java.util.Scanner;

public class booksProgram {

  public static void main(String[] args) {
    ArrayList<Book> books = new ArrayList<>();
    Scanner reader= new Scanner(System.in);

    while(true) {
      System.out.println("Name (empty will stop): ");
      String name=reader.nextLine();

      if(name.isEmpty()) {
        break;
      }

      System.out.println("Publication year: ");
      int year=Integer.valueOf(reader.nextLine());

      Book book = new Book(name,year);

      if(books.contains(book)) {
        System.out.println("Already on the list!");
        continue;
      } else {
        books.add(book);
      }
    }
    System.out.println("Thank you! Books added: " + books.size());
  }

}
