package Comparator_Interface;

import Collections.Customer;

import java.text.ParseException;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Elimane on Jan, 2020, at 21:37
 */
public class TreeSetExample {

    public static void main(String[] args) throws ParseException {
        Employee e1 = new Employee(22,5000,"11/11/2019");
        Employee e2 = new Employee(24,2000, "01/10/2018");
        Employee e3 = new Employee(27,7000,"23/12/2017");

        TreeSet<Employee> tree = new TreeSet<Employee>(new SalaryComparator());

        tree.add(e1);
        tree.add(e2);
        tree.add(e3);

        System.out.println(tree.floor(e1));

        tree.forEach(employee -> {
            System.out.println(employee.getAge()+"  "+employee.getSalary());
        });


    }

}
