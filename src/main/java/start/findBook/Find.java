package start.findBook;

import start.addBook.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Find implements FindBook {

    private Book book;
    private List<Integer> numb;
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

    @Override
    public void setIdOfTitle(String findTitle) {
        int x = 0;
        numb = new ArrayList<>();

        //operation on titles from book class
        for (String title : book.getArrayT()) {
            if (title.equals(findTitle)) {
                numb.add(x);
                x++;
            } else x++;
        }
    }

    @Override
    public void setIdOfNameLName(String findName, String findLName) {
        //operation on titles from book class
        int x = 0;
        numb = new ArrayList<>();

        while (x != book.getLicznik()) {
            if(book.getArrayN().get(x).equals(findName) && book.getArrayL().get(x).equals(findLName)){
                numb.add(x);
                x++;

            }else { x++;
            }
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
        return iterator;
    }
}
