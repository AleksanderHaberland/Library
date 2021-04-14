package start.findBook;

import java.util.List;

public interface FindBook {

    // class return table with number of found book
    public List<String> getTitle(String findTitle);
    public List<Integer> getID(String findTitle);
    public List<String> getName();
    public List<String> getLName();
    public List<String> getYear();

}
