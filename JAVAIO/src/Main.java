import classes.java.io.*;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Elimane on Jul, 2018, at 02:42
 */
public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        //LISTING FILES AND DIRECTORIES

        File f = new File("/Users/Elimane/Desktop/");

        String[] listFiles = f.list();

        System.out.println("-----------------FILESNAME-------------------");

        for(String file : listFiles)
        {
            System.out.println(file);
        }


        System.out.println("-----------------DIRECTORIES LIST-------------------");

        File[] listDirectories = f.listFiles();

        for(File directory : listDirectories)
        {
            if(directory.isDirectory())
                System.out.println(directory.getName()+" -- "+directory.getAbsolutePath());
        }

        System.out.println("-----------------FILES BY EXTENSIONS-------------------");

        //FILENAMEFILTER IS AN ABSTRACT CLASS
        FilenameFilter extensionFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                if(name.endsWith("docx") || name.endsWith("pptx"))
                    return true;

                    return false;
            }
        };

        File[] extensionsFiles = f.listFiles(extensionFilter);
        for(File file : extensionsFiles)
        {
            System.out.println(file.getName()+" -- "+file.getAbsolutePath());
        }


        //CREATING FOLDERS AND FILES

        System.out.println("-----------FOLDER CREATION");
        if(f.exists() && f.canWrite() && f.isDirectory())
        {
            File newFolder = new File(f.getAbsolutePath()+"/Newfolder");

            boolean isCreated = newFolder.mkdir();

            if(isCreated)
                System.out.println("Folder has been created!");
            else
                System.out.println("Folder creation failed!");

        }

        System.out.println("-----------FILE CREATION");
        if(f.exists() && f.canWrite() && f.isDirectory())
        {
            File newFolder = new File(f.getAbsolutePath()+"/Newfile.txt");

            boolean isCreated = false;
            try {
                isCreated = newFolder.createNewFile();
                if(isCreated)
                    System.out.println("File has been created!");
                else
                    System.out.println("File creation failed!");
            } catch (IOException e) {
                e.printStackTrace();
            }



        }

        //ACCESSING AND MODIFIYNG FOLDER ATTRIBUTES

        System.out.println("-------------ACCESSING AND MODIFIYNG FOLDER ATTRIBUTES");
        File[] allFiles = f.listFiles();
//        for(File file : allFiles)
//        {
//            if(file.isFile())
//            {
//                long size = f.length();
//                long sizeInKB = size / 1024;
//                System.out.println(file.getName()+" -- "+sizeInKB+" KB");
//
//                long lastModified = file.lastModified();
//                Date lastModifiedTime = new Date(lastModified);
//                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//                System.out.println(sdf.format(lastModifiedTime));
//            }
//            //System.out.println(file.getName()+" -- "+file.getAbsolutePath());
//        }


        //ORDERING AND MODIFYING FILES BY LAST MODIFIED TIME
        System.out.println("-------------ORDERING AND MODIFYING FILES BY LAST MODIFIED TIME");

        Arrays.sort(allFiles, new LastModifiedTimeComparator());

//        for(File file : allFiles) {
//            if (file.isFile()) {
//                long size = f.length();
//                long sizeInKB = size / 1024;
//                System.out.println(file.getName() + " -- " + sizeInKB + " KB");
//
//                long lastModified = file.lastModified();
//                Date lastModifiedTime = new Date(lastModified);
//                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//                System.out.print(sdf.format(lastModifiedTime));
//            }
//        }

        FileFilter lastModifiedFilesFilter = new FileFilter() {

            Date beginingOfTheDay = Day.getTime();

            @Override
            public boolean accept(File file) {
                //System.out.println("TODAY "+beginingOfTheDay);
                return  file.lastModified() > beginingOfTheDay.getTime() ? true : false;
            }
        };

       File[] allfileslLastModified = f.listFiles(lastModifiedFilesFilter);


        System.out.println("-------------MODIFIED TODAY");

        for(File file : allfileslLastModified) {
            if (file.isFile()) {
                long size = f.length();
                long sizeInKB = size / 1024;
                System.out.println(file.getName() + " -- " + sizeInKB + " KB");

                long lastModified = file.lastModified();
                Date lastModifiedTime = new Date(lastModified);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                System.out.print(sdf.format(lastModifiedTime));
            }
        }

        System.out.println("-------------READ FILE WITH INPUT AND FILE READER");

        File newFile = new File("test.txt");
        File source = new File("dates.txt");

        InputOutputStreams.inputStream(newFile);
        FileReaderWriter.reader(newFile);


        System.out.println("-------------READ A TEXT FILE LINE BY LINE WITH BUFFEREDREADER");

        BufferedFileReader.reader(newFile);

        FileReaderWriter.writer(newFile);


        System.out.println("-------------TP");

        FileConverter fileConverter = new FileConverter();

        fileConverter.convertFile("dates.txt","dates2.txt","dd/MM/yyyy");



    }



}
