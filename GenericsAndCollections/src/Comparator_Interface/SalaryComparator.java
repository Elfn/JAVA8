package Comparator_Interface;

import java.util.Comparator;

/**
 * Created by Elimane on Jan, 2020, at 17:14
 */
public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getSalary() > o2.getSalary()) ? 1 : (o1.getSalary() == o2.getSalary()) ? 0 : -1 ;
    }
}
