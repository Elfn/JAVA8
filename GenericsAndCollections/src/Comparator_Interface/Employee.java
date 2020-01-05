package Comparator_Interface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Elimane on Jan, 2020, at 16:19
 */
public class Employee implements Comparable {

    private int age;
    private double salary;
    private Date entranceDate;

   private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Employee(int age, double salary, String entranceDateString) throws ParseException {
        this.age = age;
        this.salary = salary;
        this.entranceDate = sdf.parse(entranceDateString) ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    @Override
    public int compareTo(Object o) {
        return (this.entranceDate.before(((Employee)o).entranceDate)) ? 1 : (this.entranceDate.equals(((Employee)o).entranceDate)) ? 0 : -1 ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", entranceDate=" + entranceDate +
                '}';
    }
}
