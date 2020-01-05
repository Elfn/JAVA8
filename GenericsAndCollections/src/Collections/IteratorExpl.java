package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Elimane on Jan, 2020, at 22:27
 */
public class IteratorExpl {
    public static void main(String[] args) {

        //----------------------------------------------- ITERATOR INTERFACE -----------------------------------------------
        //AN ITERATOR IS AN OBJECT THAT WILL RETURN THE ELEMENTS OF A COLLECTION ONE AT A TIME

        List customerList = new ArrayList<Customer>();

        Customer c1 = new Customer("Eric",23);
        Customer c2 = new Customer("John",28);
        Customer c3 = new Customer("Scott",34);
        Customer c4 = new Customer("Tiger",33);

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
        customerList.add(c4);

        Iterator<Customer> it = customerList.iterator();

        while (it.hasNext())
        {
            String name = it.next().getName();
            System.out.println(name);
        }

        System.out.println("-------------IterATE 2ND TIME");
        it =   customerList.iterator();

        while (it.hasNext())
        {
            String name = it.next().getName();

            if(name.equals("Tiger"))
                it.remove();

            //System.out.println(name);
        }

        System.out.println("-------------IterATE 3RD TIME");
        it =   customerList.iterator();

        while (it.hasNext())
        {
            String name = it.next().getName();

            if(name.equals("Tiger"))
                it.remove();

            System.out.println(name);
        }

        System.out.println("-------------ITERATION WITH LISTITERATOR-----------------");

        ListIterator<Customer> listIterator = customerList.listIterator();

        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next().getName());
        }

        System.out.println("//---------------PREVIOUS-----------------------------------");

        while(listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous().getName());
        }


    }

}
