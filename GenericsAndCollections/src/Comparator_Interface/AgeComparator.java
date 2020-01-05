package Comparator_Interface;

import java.util.Comparator;

/**
 * Created by Elimane on Jan, 2020, at 16:35
 */
public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
