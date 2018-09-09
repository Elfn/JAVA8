package classes;

/**
 * Created by Elimane on Sep, 2018, at 15:07
 */
public class BlogPostSub extends BlogPost {


    @Override
    public String getHeader() {


                if (this.text != null) {
                    String[] words = text.split(" ");

                    return words[0].toUpperCase() + " " + words[1].toUpperCase() + " " + words[2].toUpperCase() + " " + words[3].toUpperCase();
                }

                return " ";
            }

    }

