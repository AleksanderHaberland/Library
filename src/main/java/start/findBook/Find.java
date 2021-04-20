package start.findBook;

import start.addBook.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Find implements FindBook {

    private Book book;
    private int idOfBook;
    private List<Integer> numb = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private List<String> names = new ArrayList<>();
    private List<String> lnames = new ArrayList<>();
    private List<String> years = new ArrayList<>();

    public Find(Book book) {
        this.book = book;
    }

    public Book returnBook() {
        return book;
    }

    public int getIdOfBook() {
        return idOfBook;
    }

    @Override
    public void setIdOf(String findTitle) {
        int x = 0;
        //operation on titles from book class
        for (String title : book.getArrayT()) {
            if (title.equals(findTitle)) {
                numb.add(x);
                System.out.println(x + "oto x który jest elementem w tablic numb");
                idOfBook = x;
                x++;
            } else x++;
        }
    }

    @Override
    public String getTitle(int a) {
        for (int number : numb) {
            //System.out.println(book.getArrayN().get(number));
            titles.add(book.getArrayT().get(number));

        }
        return titles.get(a);
    }

    @Override
    public String getName(int a) {
        for (int number : numb) {
            //System.out.println(book.getArrayN().get(number));
            names.add(book.getArrayN().get(number));
        }
        return names.get(a);
    }

    @Override
    public String getLName(int a) {
        for (int number : numb) {
            lnames.add(book.getArrayL().get(number));
        }
        return lnames.get(a);
    }

    @Override
    public String getYear(int a) {
        for (int number : numb) {
            years.add(book.getArrayY().get(number));
        }
        return years.get(a);
    }

    public List<Integer> getNumb() {
        return numb;
    }

    public Iterator<Integer> getLength() {
         Iterator<Integer> iterator = numb.iterator();
        return  iterator;
    }
}
