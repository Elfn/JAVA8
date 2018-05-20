import com.sun.xml.internal.ws.developer.SerializationFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.openjdk.jmh.results.format.ResultFormatType.CSV;

/**
 * Created by Elimane on May, 2018, at 09:19
 */
public class JsonParsing implements Parser {
    @Override
    public File toJSON(String filePath) {

        File csvFile = new File(filePath);

        try (InputStream in = new FileInputStream(csvFile);) {
            CSV csv = new CSV(true, ',', in );
            List< String > fieldNames = null;
            if (csv.hasNext()) fieldNames = new ArrayList< >(csv.next());
            List <Map< String, String >> list = new ArrayList < > ();
            while (csv.hasNext()) {
                List < String > x = csv.next();
                Map < String, String > obj = new LinkedHashMap< >();
                for (int i = 0; i < fieldNames.size(); i++) {
                    obj.put(fieldNames.get(i), x.get(i));
                }
                list.add(obj);
            }
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(System.out, list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public File toXML(String filePath) {
        return null;
    }


}
