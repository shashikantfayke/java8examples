import domain.Address;
import domain.Employee;
import domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FlatMapExample {


    public static void main(String[] args) {

        Employee e1= new Employee(34,"Jeal",new Address("a1","aa@gmail.com"));
        Employee e2= new Employee(34,"Jeal",new Address("b1","aa@gmail.com")
                     ,new Address("c1","cc@gmail.com"));

        final List<Employee> employees = Arrays.asList(e1, e2);

        final List<String> emails = employees.stream()
                .flatMap(employee -> employee.getAddresses().stream().map(Address::getEmail))
                .collect(Collectors.toList());

        System.out.println(emails);

    }
}
