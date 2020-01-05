import java.util.*;

/**
 * Created by Elimane on Jan, 2020, at 13:13
 */
public class SearchComparisonListVsMap {
    public static void main(String[] args)
    {
        List<Customer> customerList = new ArrayList<>();

        Map<Integer,Customer> customerMap = new HashMap<>();

        for (int i=1;i<90000;i++)
        {
            Customer c = new Customer("Cust"+i,20+i);

            customerList.add(c);
            customerMap.put(c.getAge(),c);
        }

        Customer sc = new Customer("",10000) ;

        long time1 = new Date().getTime();
        int index = customerList.indexOf(sc);
        long time2 = new Date().getTime();

        System.out.println("List search time => "+(time2-time1)+" ,Result => "+customerList.get(index).toString());


         time1 = new Date().getTime();
         Customer res = customerMap.get(sc.getAge());
         time2 = new Date().getTime();

        System.out.println("Map search time => "+(time2-time1)+" ,Result => "+res);

    }
}
