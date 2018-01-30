/**
 * Created by Elimane on Jan, 2018, at 21:01
 */
public class DepartmentSalary {

    private String department;
    private double salary;

    public DepartmentSalary(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
