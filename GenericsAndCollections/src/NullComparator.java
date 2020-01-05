import java.util.Comparator;

/**
 * Created by Elimane on Jan, 2020, at 20:02
 */
public class NullComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        o1 = (o1 == null) ? Integer.MAX_VALUE : o1;
        o2 = (o2 == null) ? Integer.MAX_VALUE : o2;

//        o1 = (o1 == null) ? 0 : o1;
//        o2 = (o2 == null) ? 0 : o2;

        return o1 - o2;
    }
}
