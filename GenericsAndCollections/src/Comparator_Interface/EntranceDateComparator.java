package Comparator_Interface;

import java.util.Comparator;

/**
 * Created by Elimane on Jan, 2020, at 17:11
 */
public class EntranceDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getEntranceDate().before(o2.getEntranceDate())) ? -1 : (o1.getEntranceDate().equals(o2.getEntranceDate())) ? 0 : 1 ;
    }
}
