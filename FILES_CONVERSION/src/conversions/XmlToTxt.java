package conversions;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Elimane on Feb, 2018, at 03:33
 */
public class XmlToTxt {

    //Reads text from a character-input stream
    BufferedReader in;

    //Acts as an holder for a transformation result
    StreamResult out;

    //A TransformerHandler listens for SAX ContentHandler parse events and transforms them to a Result
    TransformerHandler th;


    public void start(String txtfilepath) {
        try {
            in = new BufferedReader(new FileReader(txtfilepath));
            out = new StreamResult(txtfilepath.replaceAll("xml","txt"));
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

  //  public static void conversion(String xmlfilepath) throws IOException, SAXException, ParserConfigurationException, TransformerException {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//
//        //Read of our xml document
//        DocumentBuilder builder = factory.newDocumentBuilder();
//        File fileXML = new File(xmlfilepath);
//        Document xml = builder.parse(fileXML);
//
//        //Define our xml file
//        File xmlFile = new File(xmlfilepath);
//
//        //Objects creation for transformation
//        StreamSource styleSource = new StreamSource(fileXML);
//        Transformer t = TransformerFactory.newInstance().newTransformer(styleSource);
//
//        //File holding result
//        String resultFile = xmlfilepath.replaceAll("xml","txt");
//        StreamResult fileTXT = new StreamResult(resultFile);
//        //transformation and save to the file
//        t.transform(new DOMSource(xml), fileTXT);
//
//        Window window = new Window(resultFile);


    }





