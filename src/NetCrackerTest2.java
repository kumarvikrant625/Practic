//find the duplicate  occurance of character from string.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employeeee {
    private String name;
    private int age;

    public Employeeee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeeee that = (Employeeee) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class NetCrackerTest2 {

    public static void main(String[] args) {
        List<Character> characters = Arrays.asList('a', 'b', 'c', 'j','a', 'd', 'e', 'f', 'g', 'h', 'i', 'j');
        Employeeee emp = new Employeeee("Rahul", 25);
        Map<Employeeee, Integer> map = new HashMap<>();
        map.put(emp, 1);

        emp.setAge(26);
        emp.setName("Rahulll");

        System.out.println(map.get(emp));

       // Map<Character, Long> map =  characters.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



    }
}
