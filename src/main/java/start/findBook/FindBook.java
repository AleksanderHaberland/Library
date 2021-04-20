package start.findBook;

import java.util.List;

public interface FindBook {

    // class return table with number of found book
    public String getTitle(int a);
    public void setIdOfTitle(String findTitle);
    public void setIdOfNameLName(String findName, String findLName);
    public String getName(int a);
    public String getLName(int a);
    public String getYear(int a);

}
