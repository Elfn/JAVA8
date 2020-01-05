import java.util.*;

/**
 * Created by Elimane on Jan, 2020, at 19:47
 */
public class Merge2Lists {
    public static void main(String[] args) {

        List firstList = new ArrayList<Integer>();
       // firstList.add(0);
        firstList.add(1);
        firstList.add(4);
        firstList.add(3);

        List secondList = new ArrayList<Integer>();
        secondList.add(2);
        secondList.add(6);
        secondList.add(7);
        secondList.add(10);
        secondList.add(null);

        //Set remove all the duplicate
       // Set<Integer> set = new HashSet<>();

        //The TreeSet class internally uses a TreeMap to store elements.
        // The elements in a TreeSet are sorted according to their natural ordering
        Set<Integer> set = new TreeSet<>(new NullComparator());

        set.addAll(firstList);
        set.addAll(secondList);



        for (Integer i : set)
        {
            System.out.println(i);
        }



    }


}
