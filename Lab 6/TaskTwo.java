import java.io.IOException;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.XMLReaderJDOMFactory;
import org.jdom2.input.sax.XMLReaderXSDFactory;
import org.jdom2.input.sax.XMLReaders;

public class TaskTwo {
    public static void main(String[] args) throws JDOMException, IOException {
        XMLReaderJDOMFactory schemaFac = new XMLReaderXSDFactory("while.xsd");
        SAXBuilder externalValidationSaxBuilder = new SAXBuilder(schemaFac);
        SAXBuilder internalValidationSaxBuilder = new SAXBuilder(XMLReaders.XSDVALIDATING);

        validate(externalValidationSaxBuilder);
        validate(internalValidationSaxBuilder);
    }

    private static void validate(SAXBuilder saxBuilder) throws JDOMException, IOException {
        
        boolean isValid = false;
        try {
            saxBuilder.build("while.xml");
            isValid = true;
        } catch (Exception e) {
            isValid = false;
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("Valid: " + isValid);
    }

}