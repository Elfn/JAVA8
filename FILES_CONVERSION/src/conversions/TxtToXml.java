package conversions;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Elimane on Feb, 2018, at 03:08
 */
public class TxtToXml {
    //Reads text from a character-input stream
    BufferedReader in;

    //Acts as an holder for a transformation result
    StreamResult out;

    //A TransformerHandler listens for SAX ContentHandler parse events and transforms them to a Result
    TransformerHandler th;


    public void start(String txtfilepath) {
        try {
            in = new BufferedReader(new FileReader(txtfilepath));
            out = new StreamResult(txtfilepath.replaceAll("txt","xml"));
            openXml();
            String str;
            while ((str = in.readLine()) != null) {
                process(str);
            }
            System.out.println("COnversion done !!!!");
            in.close();
            closeXml();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openXml() throws ParserConfigurationException, TransformerConfigurationException, SAXException {

        SAXTransformerFactory tf = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        th = tf.newTransformerHandler();

        // pretty XML output
        Transformer serializer = th.getTransformer();
        serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        serializer.setOutputProperty(OutputKeys.INDENT, "yes");

        th.setResult(out);
        th.startDocument();
        th.startElement(null, null, "inserts", null);
    }

    public void process(String s) throws SAXException {
        th.startElement(null, null, "option", null);
        th.characters(s.toCharArray(), 0, s.length());
        th.endElement(null, null, "option");
    }

    public void closeXml() throws SAXException {
        th.endElement(null, null, "inserts");
        th.endDocument();
    }
}



