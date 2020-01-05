package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elimane on Jan, 2020, at 21:20
 */
public class GenericExample {



    //GENERICS ALLOWS TO RESTRICT TYPES THAT WE HAVE IN A COLLECTION
    //And Make runtime errors converted to compile time errors

    //Generics provide type-safe and more secure application

    //Best practice is to restrict types(By using generic) in order to prevent runtime errors

    public static void main(String[] args)
    {
        System.out.println("--------------------USE OF GENERICS-----------------");

        List<Number> list = new ArrayList<Number>();
        //OR
        //List list = new ArrayList<Number>(); // <= ALSO VALID
        list.add(4);
        list.add(5);
        list.add(5.8);

       GenericExample genericExample = new GenericExample();
       genericExample.sum(list);
    }

    public void sum(List<Number> values)
    {
        double sum = 0;
        for(int i=0; i < values.size();i++)
        {
            sum += values.get(i).doubleValue();

        }
        System.out.println(sum);
    }
}
