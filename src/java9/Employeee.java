package java9;


//salary in descending order and name in ascending order.
public class Employeee {

    private String name;
    private Integer id;
    private Integer salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employeee(Integer id,String name, Integer Salary){
        this.id = id;
        this.name = name;
        this.salary = Salary;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
