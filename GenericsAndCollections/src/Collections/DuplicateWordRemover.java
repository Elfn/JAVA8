package Collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Elimane on Jan, 2020, at 20:34
 */
public class DuplicateWordRemover {
    public String removeDuplicateLetters(String s) {
        Set<Object> stringSet = new HashSet<>();
        StringBuilder outputString = new StringBuilder();

        for (Character c : s.toCharArray()) {
            //If the letter is not contained or if it is to a space, it will be added
            //In the stringBuilder to build string to return and insert into stringSet
            //Collection to continue checking up to the end of the loop
            if (!stringSet.contains(c) || c.equals(' ')) {
                stringSet.add(c);
                outputString.append(c);
            }
        }

        return outputString.toString();
    }

}
