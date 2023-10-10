package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
//        List<Person> personList = new ArrayList<>();
//        Person person = new Person("Alice");
//        personList.add(person);
//
//        System.out.println(personList); // 输出: [Person{name='Alice'}]
//
//        person.setName("Bob");
//
//        System.out.println(personList); // 输出: [Person{name='Bob'}]

        List<Person> powerList = new ArrayList<>();
        powerList.add(new Person("1"));
        powerList.add(new Person("2"));
        powerList.add(new Person("3"));
        List<Long> Ids = new ArrayList<>();
        Ids.add(4L);
        Ids.add(5L);
        List<Person> newpowerList = Ids.stream()
                .flatMap(j -> powerList.stream().map(i -> {
                    Person p = new Person(i.getName());
                    p.setId(j);
                    return p;
                }))
                .collect(Collectors.toList());



        List<Object> list1 = Arrays.asList(1, 2, 3);
//        List<Long> list2 = Arrays.asList(4L, 5L);
//
//        List<List<Object>> cartesianProduct = list1.stream()
//                .flatMap(a -> {
//                    return list2.stream().map(b -> {
//                        return Arrays.asList(a, (Object) b);
//                    });
//                })
//                .collect(Collectors.toList());
    }
}
