import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClassImplemented = new AbstractClass() {
            @Override
            public void makeSurrealArt() {
                System.out.println("Created by Dali!");
            }
        };

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }
        };

//        System.out.println(stringComparator.compare("Hello", "world"));

        Comparator<String> stringComparatorLambda = (String firstString, String secondString) -> firstString.compareTo(secondString);
        System.out.println(stringComparatorLambda.compare("a", "b"));



    }
}
