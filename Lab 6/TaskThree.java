import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class TaskThree {
    public static void main(String[] args) {
        try {
            StreamSource xmlSource = new StreamSource(new File("courses.xml"));
            StreamSource xslSourceEx1 = new StreamSource(new File("ex1.xsl"));
            StreamSource xslSourceEx2 = new StreamSource(new File("ex2.xsl"));

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformerEx1 = transformerFactory.newTransformer(xslSourceEx1);

            StreamResult resultingXML = new StreamResult(System.out);
            transformerEx1.transform(xmlSource, resultingXML);
            System.out.println("----------------------------------------------");
            Transformer transformerEx2 = transformerFactory.newTransformer(xslSourceEx2);
            transformerEx2.transform(xmlSource, resultingXML);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
