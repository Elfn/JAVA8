import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Elimane on Dec, 2019, at 19:00
 */
public class Test4 {
    public static void main(String[] args)
    {
        //------------------------------------TEST----------------------------------------------------
        System.out.println("------------Customers array will be sorted because of Compareto method in customer class------------");
        Customer[] customers = new Customer[3];

        Customer c1 = new Customer("Eric",25);
        Customer c2 = new Customer("John",23);
        Customer c3 = new Customer("Mark",24);

        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;

        Arrays.sort(customers);

        for (Customer c : customers)
        {
            System.out.println(c.getAge());
        }

    }
}
