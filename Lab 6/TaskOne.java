import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

public class TaskOne {
    public static void main(String[] args) throws JDOMException, IOException {
        SAXBuilder saxBuilder = new SAXBuilder();
        File inputFile = new File("recipes.xml");
        Document document = saxBuilder.build(inputFile);
        Element root = document.getRootElement();
        printRecipeInformation(root);
    }

    private static void printRecipeInformation(Element root) {
        Namespace recipeNamespace = root.getNamespace();
        List<Element> recipes = root.getChildren("recipe", recipeNamespace);
        for (Element recipe : recipes) {
            Attribute id = recipe.getAttribute("id");
            System.out.println(id.getValue());
            Element title = recipe.getChild("title", recipeNamespace);
            System.out.println(title.getTextNormalize());
        }
    }

}