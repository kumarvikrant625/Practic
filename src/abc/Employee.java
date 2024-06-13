package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {


    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //getter setter


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main (String... args){

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "Vikrant", "Java"));
        employee.add(new Employee(2, "Vikash", "Java"));
        employee.add(new Employee(3, "Shruti", "HR"));
        employee.add(new Employee(4, "ashu", "Account"));
        employee.add(new Employee(5, "sunil", "Techsupport"));


        // define key as employee name and return department as key and list of name as value.
        Map aggList = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
       // Map aggList = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new, Collectors.toList()));
        System.out.println(aggList);

    }
}
