package start;

import start.addBook.AddBook;
import start.addBook.Book;
import start.findBook.Find;
import start.result.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Book book = new Book();
        Printer p = new Printer();
        Find find = new Find(book);

        boolean stop = false;
        while(stop == false) {
            switch (p.introduction()) {
                case 1:
                    book.setEveryThing();
                    find = new Find(book);
                    break;
                case 2:
                    if(book.getLicznik() == 0){
                        p.pM("rggrgwwrrgrrggrgrwrgwggwwrggwrgwgwgrwrrw");
                    } else{
                        p.pM("Podaj tytuł");
                        find.getIdOf(scan.nextLine());

                            p.pM("Tytuł ksiązki to: "
                                    +find.getTitle() +
                                    "\nImię Autora: " + find.getName()
                                    + "\nNazwisko Autora " + find.getLName()
                                    + "\nRok wydania: " + find.getYear());
                    }

                    p.pM0();

                    break;
                case 3:
                    break;
                case 4:
                    stop = true;
                    break;
            }
        }
       // book.setEveryThing("e","e","1998", "e");



    }
}
