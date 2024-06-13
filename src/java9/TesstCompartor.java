package java9;

import java.util.ArrayList;
import java.util.List;

public class TesstCompartor {

    public static void main(String[] args) {

        List<Employeee> employeees = new ArrayList<>();
        Employeee employeee1 = new Employeee(1, "Vikrant", 1001);
        employeees.add(employeee1);
        employeee1 = new Employeee(2, "Viksah", 5001);
        employeees.add(employeee1);
        employeee1 = new Employeee(3, "Vivek", 6001);
        employeees.add(employeee1);
        employeee1 = new Employeee(4, "virat", 2001);
        employeees.add(employeee1);
        employeee1 = new Employeee(5, "Vishesh", 2001);
        employeees.add(employeee1);

        System.out.println(employeees);

        System.out.println("After sorting by salary in descending order and name in ascending order");

        employeees.stream().sorted((e1, e2) -> {
            if (e1.getSalary() == e2.getSalary()) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return e2.getSalary().compareTo(e1.getSalary());
            }
        }).forEach(e -> System.out.println(e));

    }
}
