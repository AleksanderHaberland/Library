import java.util.ArrayList;
import java.util.List;

public class Book implements AddBook {

    private List<String> title = new ArrayList<>();
    private List<String> name = new ArrayList<>();
    private List<String> lname = new ArrayList<>();
    private List<String> year = new ArrayList<>();

    public void setName(String name) {
        this.name.add(name);
    }

    public void setLname(String lname) {
        this.lname.add(lname);
    }

    public void setYear(String year) {
        this.year.add(year);
    }
    public void setTitle(String title) {
        this.title.add(title);
    }

    public void setEveryThing(String name, String lname, String year, String title){
        setName(name);
        setLname(lname);
        setYear(year);
        setTitle(title);
    }

    @Override
    public List<String> getArrayT() {
        return title;
    }

    @Override
    public List<String> getArrayN() {
        return name;
    }

    @Override
    public List<String> getArrayL() {
        return lname;
    }

    @Override
    public List<String> getArrayY() {
        return year;
    }


}
