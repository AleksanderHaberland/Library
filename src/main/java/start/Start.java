package start;

import start.addBook.AddBook;
import start.addBook.Book;
import start.findBook.Find;

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
        while (stop == false) {
            switch (p.introduction()) {
                case 1:   //////////////////// Dodaj książkę
                    book.setEveryThing();
                    find = new Find(book);
                    p.pM0();
                    p.pM("Dodano pomyślnie książke");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:   //////////////////// Znajdź po tytule
                    if (book.getLicznik() == 0) {
                        p.pM("Nie dodano żadnej książki !!!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        p.pM("Podaj tytuł");

                        // Setting searched titles as numbers from 0 to ... in List collection named numb
                        find.setIdOfTitle(scan.nextLine());
                        // Iterator to switching between next numb
                        Iterator<Integer> iterator = find.getLength();
                        // x represent next title with the same name
                        int x = 0;
                        while (iterator.hasNext()) {
                            p.pM0();
                            p.pM("ID:" + (find.getNumb().get(x) + 1) +
                                    "\n Tytuł ksiązki to: " + find.getTitle(x)
                                    + "\n Imię autora: " + find.getName(x)
                                    + "\n Nazwisko autora: " + find.getLName(x)
                                    + "\n Rok Wydania: " + find.getYear(x));
                            x++;
                            iterator.next();
                        }
                    }
                    p.pM0();
                    break;
                case 3:   //////////////////// Znajdź po imieniu i nazwisku
                    if (book.getLicznik() == 0) {
                        p.pM("nie dodano żadnej książki !!!");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        p.pM("Podaj imię");
                        String name = scan.nextLine();
                        p.pM("Podaj nazwisko");
                        String lname = scan.nextLine();

                        // Setting searched titles as numbers from 0 to ... in List collection named numb
                        find.setIdOfNameLName(name, lname);
                        // Iterator to switching between next numb
                        Iterator<Integer> iterator = find.getLength();
                        // x represent next title with the same name
                        int x = 0;
                        while (iterator.hasNext()) {
                            p.pM0();
                            p.pM("ID:" + (find.getNumb().get(x) + 1) +
                                    "\n Tytuł ksiązki to: " + find.getTitle(x)
                                    + "\n Imię autora: " + find.getName(x)
                                    + "\n Nazwisko autora: " + find.getLName(x)
                                    + "\n Rok Wydania: " + find.getYear(x));
                            x++;
                            iterator.next();
                        }
                    }
                    p.pM0();
                    break;
                case 4:
                    stop = true;
                    break;
            }
        }

    }
}
