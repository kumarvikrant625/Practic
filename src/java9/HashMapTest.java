package java9;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

class Employee{

    private String name;
    private int age;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
       return Boolean.FALSE;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
public class HashMapTest {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        Map<Employee, String> employeeMap = new HashMap();
        List<Employee> employeeList = List.of(e1, e2);
        employeeMap.put(e1, "John");
        employeeMap.put(e2, "Doe");
        System.out.println(employeeMap.size());
        List<String> department = employeeList.stream().map(e-> e.getDepartment()).collect(Collectors.toList());
        System.out.println(department);
    }
}
