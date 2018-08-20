package classes.java.io;

import java.io.*;

/**
 * Created by Elimane on Aug, 2018, at 06:24
 */
public class BufferedFileReader {

    public static void reader(File file) throws IOException {

        //Declare it out of try clause to access it and close it in finally part of exception
        BufferedReader buffer = null;

        try {
            FileReader reader = new FileReader(file);

             buffer = new BufferedReader(reader);

            String s, content;
            StringBuilder builder = new StringBuilder();

            while ((s = buffer.readLine()) != null)
            {
                //Process line
                builder.append(s).append(System.lineSeparator());
            }

            content = builder.toString();
            System.out.println(content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if(!buffer.equals(null))
            buffer.close();

        }

    }
}
