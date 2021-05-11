package start;

import java.util.Scanner;

public class Printer {
    Scanner scan = new Scanner(System.in);

    public void pM0(){
        System.out.println();
    }

    public void pM(String mess){
        System.out.println(mess);
    }

    public int introduction (){
        pM("Program umożliwia dodanie książki, " +
                "Odnalezienie książki za pomocą tytułu, Odnalezienie książki po imieniu i nazwisku autora" +
                "\ndecuduj programem wpisująć odpowiednią cyfrę!");
        pM0();
        pM("Wybierz co chcez zrobić wpisująć: " +
                "\n 1. Dodaj książkę " +
                "\n 2. Znajdź książkę po tytule" +
                "\n 3. Znajdź ksiązkę po imieniu i nazwisku autora " +
                "\n 4. Wyjdź z programu");

        return scan.nextInt();
    }
    private int x = 0;

}