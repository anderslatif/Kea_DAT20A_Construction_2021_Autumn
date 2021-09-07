import java.util.Date;
import java.util.stream.Stream;

public class ObjectStream {
    public static void main(String[] args) {
/*        Stream<Date> clock = Stream.generate(Date::new);
        clock.forEach(timestamp -> System.out.println(timestamp));*/

        // alternative syntax
        Stream<Date> clock = Stream.generate(() -> new Date());
/*        clock.forEach(timestamp -> {
        // multiple statements
            System.out.println("And the time is....");
            System.out.println(timestamp);
        });*/

        clock.forEach(System.out::println);

    }
}
