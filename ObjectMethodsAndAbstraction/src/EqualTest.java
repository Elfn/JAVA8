import classes.Customer;
import classes.Gender;
import classes.MyTime;
import classes.TimeUnit;

/**
 * Created by Elimane on Sep, 2018, at 11:23
 */
public class EqualTest {

    public static void main(String[] args)
    {

        Customer c1 = new Customer("1","John","McCall",true, Gender.MALE);
        Customer c2 = new Customer("2","Olivia","Maxwell",true, Gender.FEMALE);
        Customer c3= new Customer("3","Davis","Parton",true, Gender.MALE);
        Customer c4 = new Customer("4","John","Vixen",true, Gender.MALE);
        Customer c5 = new Customer("5","Erica","Bilt",false, Gender.FEMALE);

        boolean isSame = c1.equals(c2);

        System.out.println(isSame);


        System.out.println("---------TP---------");

        MyTime time1 = new MyTime(14, TimeUnit.DAY);
        MyTime time2 = new MyTime(2, TimeUnit.WEEK);
        MyTime time3 = new MyTime(8, TimeUnit.WEEK);
        MyTime time4 = new MyTime(2, TimeUnit.MONTH);

        System.out.println(time1.equals(time2)); // should be true
        System.out.println(time3.equals(time4)); // should be true
        System.out.println(time1.equals(time4)); // should be false
    }
}
