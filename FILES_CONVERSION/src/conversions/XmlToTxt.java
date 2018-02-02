package conversions;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;

/**
 * Created by Elimane on Feb, 2018, at 03:33
 */
public class XmlToTxt {


    public static void conversion(String xmlfilepath) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Read of our xml document
        DocumentBuilder builder = factory.newDocumentBuilder();
        File fileXML = new File(xmlfilepath);
        Document xml = builder.parse(fileXML);

        //Define our xml file
        File xmlFile = new File(xmlfilepath);

        //Objects creation for transformation
        StreamSource styleSource = new StreamSource(fileXML);
        Transformer t = TransformerFactory.newInstance().newTransformer(styleSource);

        //File holding result
        String resultFile = xmlfilepath.replaceAll("xml","txt");
        StreamResult fileTXT = new StreamResult(resultFile);
        //transformation and save to the file
        t.transform(new DOMSource(xml), fileTXT);

        Window window = new Window(resultFile);


    }




}
