import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class Height extends DefaultHandler {
  int h = -1;
  int max = 0;
  int ingredientNumber = 0;

  public void startElement(String uri, String localName, String qName, Attributes atts) {
    h++;
    if (h > max) {
      max = h;
    }
    if (localName == "ingredient") {
      ingredientNumber++;
    }
  }

  public void endElement(String uri, String localName, String qName) {
    h--;
  }

  public void characters(char[] ch, int start, int length) {
    if (h + 1 > max)
      max = h + 1;
  }

  public static void main(String[] args) {
    try {
      Height handler = new Height();
      XMLReader reader = XMLReaderFactory.createXMLReader();
      reader.setContentHandler(handler);
      reader.parse(args[0]);
      System.out.println(handler.max);
      System.out.println(handler.ingredientNumber);
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
