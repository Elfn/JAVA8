import org.apache.commons.lang3.StringUtils;

/**
 * Created by Elimane on Feb, 2018, at 17:21
 */
public class ConcatArrayItems {

    public static  String concat(String[] array)
    {
        String s = "";

//        for(String item : array)
//        {
//            s = StringUtils.concat(array);
//        }

        s = StringUtils.concat(array);

        return s;
    }

}
