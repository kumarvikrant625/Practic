package binarysearch;

import java.util.List;
import java.util.stream.Collectors;

class Person{
    int age;
    String name;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TTest {


    public static Runnable getTask(String s) {
        Runnable runnable = () -> {
            System.out.println(s);
            System.out.print(Thread.currentThread().getName());
        };
        return runnable;
    }

    public static void main(String[] args) {
        List<Person> list = List.of(new Person("Vikrant", 19), new Person("Vikas", 22), new Person("Vikesh", 23));
        list.stream().sorted((p1, p2) ->  p2.getAge() - p1.getAge()).forEach(p -> System.out.println(p.toString()));

    }
}
