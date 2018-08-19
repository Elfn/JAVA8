package classes.java.io;

import java.io.File;
import java.util.Comparator;

/**
 * Created by Elimane on Aug, 2018, at 22:26
 */
public class LastModifiedTimeComparator implements Comparator<File> {
    @Override
    public int compare(File o1, File o2) {
        return  o1.lastModified() > o2.lastModified() ? 1 : o1.lastModified() == o2.lastModified() ? 0  : -1;


    }
}
