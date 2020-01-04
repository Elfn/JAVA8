import java.util.*;

/**
 * Created by Elimane on Jan, 2020, at 01:19
 */
public class HashMapExpl {
    public static void main(String[] args) {
        //---------------------------MAP--------------------------------------------------------------
        //IS A SET OF KEYS AND VALUES TIED TOGETHER
        //IT IS A DICTIONARY IN WHICH WE LABEL VALUE WITH A KEY AND SEARCH OT TROUGHT THAT KEY
        //IT DOESNT ACCEPT DUPLICATE VALUES


        Customer c1 = new Customer("Eric",23);
        Customer c2 = new Customer("John",28);
        Customer c3 = new Customer("Scott",34);
        Customer c4 = new Customer("Tiger",33);


        //WITH 100 MEMORY BLOCKS TO STORE ITEMS SO THAT PERFORMANCE BE BETTER
        Map<String,Customer> map = new HashMap<String,Customer>(100);

        map.put(c1.getName(), c1);
        map.put(c2.getName(), c2);
        map.put(c3.getName(), c3);
        map.put(c4.getName(), c4);

//        System.out.println(map.get("Eric"));
//        System.out.println(map.get("John"));

        //--CREATE COLLECTION BY USING MAP
        Collection<Customer> customers = map.values();
//        customers.forEach(customer -> {
//            System.out.println(customer.getName());
//        });

        //CREATE ITERATOR FROM COLLECTION
        Iterator<Customer> customerIterator = customers.iterator();
        while (customerIterator.hasNext())
        {
            String name =  customerIterator.next().getName() ;
            System.out.println(name);
        }

        //HOW TO USE ENTRY WITH A COLECTION STORING ENTRY MAP
        Collection<Map.Entry<String, Customer>> entrySet = map.entrySet();

        //MAKE ITERATOR FROM COLLECTION OF ENTRY To Directly  ACCESS  KEYS AND VALUES
        Iterator<Map.Entry<String, Customer>> iterator = entrySet.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Customer> entry = iterator.next();
            String key =  entry.getKey() ;
            Customer value = entry.getValue();
            System.out.println("Key :"+key+" | Value :"+value);
        }

        //Only Work with keys by using keyset
        Collection<String> keys = map.keySet();
        Iterator<String> itKey = keys.iterator();
        while (itKey.hasNext())
        {

            System.out.println("Key :"+itKey.next());
        }


    }
}
