/**
 * Created by Elimane on Feb, 2018, at 09:48
 */
public class wordCount {

    private static wordCount wordcount = new wordCount();

    public static wordCount getInstance() {
        return wordcount;
    }

    private wordCount() {
    }

    public int count(String words) {
        String[] w = words.split(" ");
        int counter = 0;


        for (int i = 0; i < w.length; i++) {
            counter = i + 1;
        }

        return counter;
    }

    public int coutOccurence(String sentence, String wordToseearch) {
        sentence = sentence.toLowerCase();
        wordToseearch = wordToseearch.toLowerCase();
        //get number of occurences
        int counter = 0;
        //get index of the word to search and the from index
        int index = 0;

        while (index != -1) {
            index = sentence.indexOf(wordToseearch, index);

            if (index != -1) {
                counter++;
            }
            if (index == -1) {
                break;
            }
            if (index < sentence.length() - 1) {
                index++;
            }

        }

        return counter;
    }

    public String deleteAll(String sentence, String wordToDelete) {
        sentence = sentence.toLowerCase();
        wordToDelete = wordToDelete.toLowerCase();

        //get index of the word to search and the from index
        int index = 0;
        //Word to delete
        String word = "";

        while (index != -1) {
            index = sentence.indexOf(wordToDelete);

            if (index != -1) {
               word = sentence.substring(index,index+1) ;

               return sentence = sentence.replaceAll(word, "");

            }
            if (index == -1) {
                break;
            }
            if (index < sentence.length() - 1) {
                index++;
            }
        }

      return "word not found!!!";
    }
}

