package classes;

/**
 * Created by Elimane on Sep, 2018, at 14:55
 */
public class BlogPost {



    protected String text = null;
    private String header = null;
    private String[] tags = null;
    private String author_nickName = null;
    private String first_name = null;
    private String last_name = null;

    public String getText() {
        return text;
    }

    public void setText(String test) {
        this.text = test;
    }

    public String getHeader() {
        if (this.text != null) {
            String[] words = text.split(" ");

            return words[0] + " " + words[1] + " " + words[2] + " " + words[3];
        }

        return "";
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String[] getTags() {

        String[] myTags = null;
        if (this.text != null) {
            String[] words = text.split(" ");

            myTags = new String[3];

            myTags[0] = words[2];
            myTags[1] = words[8];
            myTags[2] = words[5];


        }

        return myTags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getAuthor_nickName() {
        return this.first_name+" _ "+this.last_name;
    }

    public void setAuthor_nickName(String author_nickName) {
        this.author_nickName = author_nickName;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
