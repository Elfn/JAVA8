import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Elimane on May, 2018, at 05:32
 */
public class TitleCase {

    public static String casify(String sentence) {

        String newSentence = sentence.toLowerCase();
        String[] table = newSentence.split(" ");
        String res = "";

        for (String word : table) {
//            if (word.equals("the") || word.equals("of") || word.equals("to") || word.equals("in")) {
//                word = word.toLowerCase();
//            }

            res += " "+word.replace(String.valueOf(word.charAt(0)), String.valueOf(word.charAt(0)).toUpperCase());
        }

        return res;
    }
}
