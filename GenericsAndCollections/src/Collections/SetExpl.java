package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Elimane on Jan, 2020, at 20:08
 */
public class SetExpl {
    public static void main(String[] args) {
        //============================SET ===========================
        //ITS A COLLECTION THAT DO NOT DUPLICATE ITEMS
        //AGE has been used to make hashcode so if 2 objects has the same
        //Age Set collection will assumed it as duplication and will choose only one object to display

        Customer c1 = new Customer("Eric",23);
        Customer c2 = new Customer("John",28);
        Customer c3 = new Customer("Scott",34);

        //That two objects are same but distinguished by ages( Because we used AGE to make hashcode)
        //So they will be displayed 2 times by Set collection
        Customer c4 = new Customer("Tiger",25);
        Customer c5 = new Customer("Tiger",33);

        Set<Customer> customerSet = new HashSet<Customer>();

        customerSet.add(c1);
        customerSet.add(c2);
        customerSet.add(c3);
        customerSet.add(c4);
        customerSet.add(c5);

        Iterator<Customer> customerIterator = customerSet.iterator();

        while(customerIterator.hasNext()){
            System.out.println(customerIterator.next().getName());
        }

    }
}
