import conversions.TxtToXml;
import conversions.XmlToTxt;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Created by Elimane on Feb, 2018, at 03:06
 */
public class Main__ {
    public  static void  main(String [] args)
    {
        //new TxtToXml().start("/Users/Elimane/conversionTest/data.txt");


        try {
            XmlToTxt.conversion("/Users/Elimane/conversionTest/data.xml");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
