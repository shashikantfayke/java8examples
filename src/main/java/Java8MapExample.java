import domain.Address;
import domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8MapExample {


    public static void main(String[] args) {

        List<Person> persons= Arrays.asList(
                new Person(70,"Jack",new Address("aa1","aa@example.com")),
                new Person(50,"Jack",new Address("bb2","bb@example.com")),
                new Person(40,"Jack",new Address("cc2","cc@example.com")),
                new Person(70,"Jack",new Address("dd2","dd@example.com"))
        );
        /*
        We need to get the list of email addresses.
         */

        List<String> emails= persons.stream()
                                    .map(person -> person.getAddress().getEmail())
                                    .collect(Collectors.toList());
        System.out.println(emails);
    }
}
