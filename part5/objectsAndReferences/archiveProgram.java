package part5.objectsAndReferences;

import java.util.ArrayList;
import java.util.Scanner;

public class archiveProgram {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Archive> bookList = new ArrayList<>();

    while(true) {
      System.out.println("Identifier? (empty will stop) ");
      String identifier = reader.nextLine();

      if(identifier.isEmpty()) {
        break;
      }

      System.out.println("Name? (empty will stop) ");
      String name = reader.nextLine();

      if(name.isEmpty()) {
        break;
      }

      Archive book = new Archive(identifier, name);

      if(!(bookList.contains(book))) {
        bookList.add(book);
      }
    }

    System.out.println("==Items==");

    for(int i=0; i<bookList.size();i++) {
      System.out.println(bookList.get(i));
    }
  }

}
