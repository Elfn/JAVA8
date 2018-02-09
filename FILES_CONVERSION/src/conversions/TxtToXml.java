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
    BufferedReader input;

    //Acts as an holder for a transformation result
    StreamResult output;

    //A TransformerHandler listens for SAX ContentHandler parse events and transforms them to a Result
    TransformerHandler thandler;


    public void start_(String txtfilepath) {
        try {
            input = new BufferedReader(new FileReader(txtfilepath));
            output = new StreamResult(txtfilepath.replaceAll("txt","xml"));
            openXml();
            String str;
            while ((str = input.readLine()) != null) {
                process(str);
            }
            System.out.println("COnversion done !!!!");
            input.close();
            closeXml();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openXml() throws ParserConfigurationException, TransformerConfigurationException, SAXException {

        SAXTransformerFactory tf = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        thandler = tf.newTransformerHandler();

        // pretty XML output
        Transformer serializer = thandler.getTransformer();
        serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        serializer.setOutputProperty(OutputKeys.INDENT, "yes");

        thandler.setResult(output);
        thandler.startDocument();
        thandler.startElement(null, null, "inserts", null);
    }

    public void process(String s) throws SAXException {
        thandler.startElement(null, null, "option", null);
        thandler.characters(s.toCharArray(), 0, s.length());
        thandler.endElement(null, null, "option");
    }

    public void closeXml() throws SAXException {
        thandler.endElement(null, null, "inserts");
        thandler.endDocument();
    }
}



