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
    public List<String> getTitle() {
        return book.getArrayT();
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
