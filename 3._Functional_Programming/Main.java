import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // anonymous class
        AbstractClass abstractClassImplemented = new AbstractClass() {
            @Override
            public void makeSurrealArt() {

            }
        };

        // implementation of a (functional) interface
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }
        };
//        System.out.println(comparator.compare("a", "b"));

        Comparator<String> lambdaComparator = (String firstString, String secondString) -> firstString.compareTo(secondString);

        Comparator<String> lambdaComparatorTypeInference = (firstString, secondString) -> firstString.compareTo(secondString);


        System.out.println(lambdaComparatorTypeInference.compare("a", "b"));

        // Create this as lambda
        Concatenator concat = (prependorString, appendorString) -> prependorString + appendorString;

        System.out.println(concat.cat("Mind", "Blown"));

    }
}
