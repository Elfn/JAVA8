/**
 * Created by Elimane on Jan, 2018, at 18:09
 */
public class Employee {

    private String department;
    private String name;
    private double salary;

    public Employee(String department, String name, double salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
