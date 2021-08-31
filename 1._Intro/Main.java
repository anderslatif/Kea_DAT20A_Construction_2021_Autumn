import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    // generics
/*    public static <T> void out(T content) {
        System.out.println(content);
    }*/

    public static void main(String[] args) {

/*        Word[] words = new Word[]{
                new Word("Bord"),
                new Word("BordBord"),
                new Word("Konglomerat"),
                new Word("Skrivebord"),
                new Word("SkrivebordBord")
        };
        Systemos.out.println(words);*/

        ArrayList<Word> animals = new ArrayList<>(){{
            add(new Word("Elefant"));
            add(new Word("Giraf"));
            add(new Word("Slange"));
            add(new Word("Bille"));
            add(new Word("Mus"));
        }};

        Systemos.out.println(animals);


    }

}
