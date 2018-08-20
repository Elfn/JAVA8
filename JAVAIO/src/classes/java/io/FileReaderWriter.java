package classes.java.io;

import java.io.*;

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

    public static void  writer(File file) throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter(file.getAbsolutePath(),true);

            writer.append(System.lineSeparator());
            writer.append("something");
            System.out.println("Content has been writen successfully!!!");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(!writer.equals(null))
            {
                writer.flush();
                writer.close();
            }
        }

    }


}
