package Collections;

import java.util.Map;

/**
 * Created by Elimane on Dec, 2019, at 19:00
 */
public class Test2 {
    public static void main(String[] args)
    {
        //------------------------------------TEST----------------------------------------------------
        LetterCounter letterCounter = new LetterCounter();
        Map<String, Integer> map = letterCounter.harfSay("Java, is the most used object oriented language");
        letterCounter.printTheLetterCounts(map);


    }
}
