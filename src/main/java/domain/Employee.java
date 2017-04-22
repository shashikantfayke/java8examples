package domain;

import java.util.Arrays;
import java.util.List;


public class Employee {

    private  Integer age;
    private  String name;
    List<Address> addresses;

    public Employee(Integer age, String name, Address...addresses) {
        this.age = age;
        this.name = name;
        this.addresses = Arrays.asList(addresses);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}

