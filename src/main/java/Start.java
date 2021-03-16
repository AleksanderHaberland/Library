
public class Start {
    public static void main(String[] args) {
        Find find = new Find(new Book());
        find.returnBook().setEveryThing("abc","bca","1998", "Java");

        System.out.println(find.getTitle());
    }
}
