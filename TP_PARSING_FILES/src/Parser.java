import java.io.File;

/**
 * Created by Elimane on May, 2018, at 09:31
 */
public interface Parser {

    public File toJSON(String filePath);
    public File toXML(String filePath);


//    public String fileIdentifier(String filePath);


}
