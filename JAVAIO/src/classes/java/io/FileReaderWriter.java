package classes.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Elimane on Aug, 2018, at 00:58
 */
public class FileReaderWriter {

    public static void  reader(File file)
    {

        try {
            FileReader fileReader = new FileReader(file);
            char array[] = new char[(int)file.length()];


            while ((fileReader.read(array) != -1)) {
                System.out.println(array);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
