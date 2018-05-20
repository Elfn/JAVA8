/**
 * Created by Elimane on May, 2018, at 09:47
 */
public class FileIdentifier {


    //To identify wrong lines
    //reference must have 10 digits
    //there are only R,G,B color not others
    //price in decimal or double
    //size in int
    private static  FileIdentifier identifier = new FileIdentifier();

    private FileIdentifier() {
    }

    public static FileIdentifier getInstance(){
        return identifier;
    }

    public String fileIdentifier(String filePath){

        return null;


    }
}
