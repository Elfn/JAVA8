package classes.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Elimane on Aug, 2018, at 00:11
 */
public class InputOutputStreams {

   // A Buffer is a portion in the memory that is used to store a stream of data from peripheral devices.
    // Then from this buffer this stream of data is collected and stored in variables.
    // A stream can be defined as a continuous flow of data.
    // The buffer is quite useful as Java deals everything as a String


    public static void inputStream(File file)
    {
        InputStream inputStream;

        try {

            inputStream = new FileInputStream(file);

            int i = 0;
            while((i = inputStream.read()) != -1)
            {
                char c = (char) i;
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
