package start;

import start.addBook.AddBook;
import start.addBook.Book;
import start.findBook.Find;
import start.result.Printer;

import java.util.ArrayList;
import java.util.Iterator;
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
                        p.pM("nie dodano żadnej książki !!!");
                    } else{
                        p.pM("Podaj tytuł");

                        // Setting searched titles as numbers from 0 to ... in List colection named numb
                        find.setIdOf(scan.nextLine());
                        // Iterator to switching between next numb
                        Iterator<Integer> iterator = find.getLength();
                        // x represent next title with the same name
                        int x =0;
                        while(iterator.hasNext()){
                            p.pM0();
                            p.pM("ID:" + find.getNumb().get(x)+
                                    "\n Tytuł ksiązki to: " +find.getTitle(x)
                                    + "\n Imię autora: "+ find.getName(x)
                                    + "\n Nazwisko autora: "+ find.getLName(x)
                                    + "\n Rok Wydania: "+ find.getYear(x));
                            x++;
                            iterator.next();
                        }
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
