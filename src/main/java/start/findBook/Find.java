package start.findBook;

import start.addBook.Book;

import java.util.ArrayList;
import java.util.List;

public class Find implements FindBook{

    private Book book;

    public Find(Book book){
        this.book = book;
    }
    public Book returnBook(){
        return book;
    }

    @Override
    public List<Integer> getTitle(String findTitle) {
        List<Integer> numb = new ArrayList<>();

        //operation on titles from book class
        for(String title : book.getArrayT()){
            if (title.equals(findTitle)){
                numb.add(1);
            }
            else{
                numb.add(0);
            }
        }
        return numb;
    }

    @Override
    public List<String> getName() {
        return null;
    }

    @Override
    public List<String> getLName() {
        return null;
    }
}
