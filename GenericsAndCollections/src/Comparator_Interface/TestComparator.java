package Comparator_Interface;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Elimane on Jan, 2020, at 17:18
 */
public class TestComparator {
    public static void main(String[] args) throws ParseException {


        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee(22,3000,"11/11/2019");
        Employee e2 = new Employee(24,2000, "01/10/2018");
        Employee e3 = new Employee(27,7000,"23/12/2017");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        //COMPARISON BASED ON AGE, ENTRANCEDATE, SALARY
        Collections.sort(employeeList, new EntranceDateComparator());
        //Collections.sort(employeeList, new AgeComparator());

        for(Employee emp : employeeList)
        {
            System.out.println(emp.getEntranceDate());
        }

        System.out.println("-------------------------------BINARY SEARCH-------------------------------");
        int index = Collections.binarySearch(employeeList,new Employee(0,0.0,"23/12/2017"),new EntranceDateComparator());

        if(index >= 0)
        {
            System.out.println("Binary search result => "+employeeList.get(index));
        }
    }
}
