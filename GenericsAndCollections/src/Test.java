import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elimane on Dec, 2019, at 19:00
 */
public class Test {
    public static void main(String[] args)
    {
        System.out.println("---------------------------------------------ARRAY LIST----------------------------------------------------");
                                                      //ARRAYLIST IS AN ORDERED SEQUENCE OF ELEMENTS
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(4);
        integers.add(5);
        integers.add(-2);

        System.out.println(integers.size());
        System.out.println("3rd item :"+integers.get(2));
        integers.set(1,11);
        System.out.println("2nd item :"+integers.get(1));
        integers.add(1,7);
        System.out.println(integers.size());
        System.out.println("2nd item :"+integers.get(1));
        System.out.println("3rd item :"+integers.get(2));
        integers.remove(0);
        System.out.println("1rst item :"+integers.get(0));

        integers.clear();

        System.out.println("After cleared : "+integers.size());


        //----------------------------------------------- Custom object -----------------------------------------------
        List customerList = new ArrayList<Customer>();

        Customer c1 = new Customer("Eric",23);
        Customer c2 = new Customer("John",28);
        Customer c3 = new Customer("Scott",34);
        Customer c4 = new Customer("Tiger",33);

        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);

        customerList.add(0,c3);

        c2 = (Customer) customerList.get(0);

        //System.out.println(c2.toString()+" "+customerList.indexOf(c2));
        Customer c24 = new Customer("Doe",54);

        //IT WILL RETURN -1 BECAUSE c24 doesnt exists in list
        System.out.println("C24 "+customerList.indexOf(c24));

        customerList.forEach(c -> {
            System.out.println("Customers list size => "+ c);
             System.out.println("INDEX of  "+c+" is "+customerList.indexOf(c));
         });

         //------------------------------------SEARCH ITEM INTO LIST------------------------------------------------

        customerList.forEach(c -> {
            System.out.println("Is List contained "+ c.toString() +" : "+ customerList.contains(c));
        });





    }
}
