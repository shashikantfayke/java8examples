import domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class GroupByWithClassifier {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person(1, "bob"),
                new Person(34, "sera"),
                new Person(40, "bob"),
                new Person(50, "Mike"),
                new Person(20, "Zeal"),
                new Person(50, "ED")
        );

        printGrouping(persons.stream(), Person::getAge);

    }

    public static <T> void printGrouping(Stream<Person> people, Function<Person, T> classifier) {


    }

}
