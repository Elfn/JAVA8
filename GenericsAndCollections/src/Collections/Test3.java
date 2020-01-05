package Collections;

/**
 * Created by Elimane on Dec, 2019, at 19:00
 */
public class Test3 {
    public static void main(String[] args)
    {
        //------------------------------------TEST----------------------------------------------------
        DuplicateWordRemover remover = new DuplicateWordRemover();
        String sentence = remover.removeDuplicateLetters("Collections is the most important item in Java development");
        System.out.println(sentence);


    }
}
