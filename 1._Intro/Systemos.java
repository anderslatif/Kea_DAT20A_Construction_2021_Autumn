import java.util.ArrayList;
import java.util.List;

public class Systemos {

    public static class out {

        public static void println(String content) {
            System.out.println(content);
        }

        public static void println(int content) {
            System.out.println(content);
        }

        public static void println(double content) {
            System.out.println(content);
        }

        public static void println(Object content) {
            System.out.println(content);
        }

        public static void println(Object[] content) {
            for (Object object : content) {
                println(object);
            }
        }

        public static void println(List content) {
            content.forEach(object -> println(object));
//            content.forEach(System.out::println);
        }

    }

}
