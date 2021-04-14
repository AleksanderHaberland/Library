package start;

import start.addBook.AddBook;
import start.addBook.Book;
import start.findBook.Find;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        Book book = new Book();
        book.setEveryThing("e","e","1998", "e");

        book.setEveryThing("Java","bca","1998", "Java");
        book.setEveryThing("e","e","1998", "e");
        book.setEveryThing("e","e","1998", "e");
        book.setEveryThing("Java","bca","1998", "Java");
        book.setEveryThing("e","e","1998", "e");


        Find find = new Find(book);
        find.getID("e");
        System.out.println("title is: " +find.getTitle("e") + "name is: " + find.getName()
                + "last name is " + find.getLName() + "Year: " + find.getYear());

    }
}
