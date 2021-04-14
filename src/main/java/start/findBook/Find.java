package start.findBook;

import start.addBook.Book;

import java.util.ArrayList;
import java.util.List;

public class Find implements FindBook{

    private Book book;
    private List<Integer> numb = new ArrayList<>();
    private List<String> titles = new ArrayList<>();
    private List<String> names = new ArrayList<>();
    private List<String> lnames = new ArrayList<>();
    private List<String> years = new ArrayList<>();

    public Find(Book book){
        this.book = book;
    }
    public Book returnBook(){
        return book;
    }


    @Override
    public List<Integer> getID(String findTitle) {
            int x = 0;
        //operation on titles from book class
        for(String title : book.getArrayT()){
            if (title.equals(findTitle)){
                numb.add(x);
                x++;
            }
            else{
                x++;
            }
        }
        return numb;
    }

    @Override
    public List<String> getTitle(String findTitle) {
        for(int number : numb){
            //System.out.println(book.getArrayN().get(number));
            titles.add(book.getArrayT().get(number));
        }
        return titles;
    }

    @Override
    public List<String> getName() {
        for(int number : numb){
            //System.out.println(book.getArrayN().get(number));
            names.add(book.getArrayN().get(number));
        }
        return names;
    }

    @Override
    public List<String> getLName() {
        for(int number : numb){
            lnames.add(book.getArrayL().get(number));
        }
        return lnames;
    }

    @Override
    public List<String> getYear() {
        for(int number : numb){
            years.add(book.getArrayY().get(number));
        }
        return years;
    }

}
