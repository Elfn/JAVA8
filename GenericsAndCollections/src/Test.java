import java.util.ArrayList;

/**
 * Created by Elimane on Dec, 2019, at 19:00
 */
public class Test {
    public static void main(String[] args)
    {
        System.out.println("---------------------------------------------ARRAY LIST----------------------------------------------------");

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




    }
}
