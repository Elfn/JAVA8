import classes.BlogPost;
import classes.BlogPostSub;

/**
 * Created by Elimane on Sep, 2018, at 15:11
 */
public class BlogTest {

    public static void main(String[] args)
    {
        BlogPost blog = new BlogPost();
        BlogPostSub sub = new BlogPostSub();

        blog.setText("Je suis  à la recherche d'un stage PFE(Projet de Fin d’Etudes) . Mon objectif est de partager et apprendre au sein ");
        sub.setText("Je suis  à la recherche d'un stage PFE(Projet de Fin d’Etudes) . Mon objectif est de partager et apprendre au sein ");

        System.out.println(blog.getHeader());
        System.out.println(sub.getHeader());
    }
}
