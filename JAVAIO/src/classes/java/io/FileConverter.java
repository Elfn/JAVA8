package classes.java.io;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Elimane on Aug, 2018, at 07:26
 */
public class FileConverter {

    public FileConverter() {
    }

    public void convertFile(String sourcePath, String targetPath, String datePattern) throws IOException, ParseException {

        File fileSource = new File(sourcePath);
        File fileTarget = new File(targetPath);

        //READ PART

        FileReader reader = new FileReader(fileSource);

        BufferedReader buffer = new BufferedReader(reader);

        String s, content;
        StringBuilder builder = new StringBuilder();

        while ((s = buffer.readLine()) != null)
        {
            //Process line
            builder.append(s).append(System.lineSeparator());
        }

        content = builder.toString();


        //WRITE PART

        FileWriter writer = new FileWriter(fileTarget.getAbsolutePath(),true);
        Scanner scan = new Scanner(content);
        BufferedWriter bw = new BufferedWriter(writer);


        while(scan.hasNextLine())
        {
            String line = scan.nextLine();
            DateFormat originalFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
            DateFormat targetFormat = new SimpleDateFormat(datePattern);
            Date date = originalFormat.parse(line);
            bw.write(String.valueOf(targetFormat.format(date)+"\n"));

        }


        bw.flush();
        bw.close();


    }
}
