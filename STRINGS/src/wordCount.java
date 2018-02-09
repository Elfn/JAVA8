/**
 * Created by Elimane on Feb, 2018, at 09:48
 */
public class wordCount {

    private static wordCount wordcount = new wordCount();

    public static wordCount getInstance()
    {
        return wordcount;
    }

    private wordCount() {
    }

    public int count(String words)
    {
        String[] w = words.split(" ");
        int counter = 0;


        for(int i=0; i < w.length; i++)
        {
           counter = i+1;
        }

        return counter;
    }

    public int coutOccurence(String sentence,String wordToseearch)
    {
        int counter = 0;

        String[] w = sentence.split(" ");

        for(String item : w)
        {
            if(item.equalsIgnoreCase(wordToseearch))
            {
                counter++;
            }
        }

//        if(sentence.contains(wordToseearch))
//        {
//            counter++;
//        }
        return counter;
    }

}
