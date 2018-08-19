package classes.java.io;

import java.io.File;
import java.util.Comparator;

/**
 * Created by Elimane on Aug, 2018, at 22:39
 */
public class FileSizeComparator implements Comparator<File> {
    @Override
    public int compare(File o1, File o2) {
        return o1.length() > o2.length() ? 1 : o1.length() == o2.length() ? 0  : -1;
    }
}
