/**
 * Created by Elimane on May, 2018, at 08:33
 */
public class RegexpMain {

    public static void main(String[] args)
    {
        String text = "Text processing software               such as Microsoft Word may change the case of\n" +
                "sentences. One of the most useful          conversions is the headline format. In this\n" +
                "format, all          the words starts with a capital              letter except the words like “for,\n" +
                "the, in”. And all the         remaining          letters become           lowercase.";

    String[] table = text.split("\\W+");

    for (String word : table)
    {
        System.out.println(word);
    }

    }
}
