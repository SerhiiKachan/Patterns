package patterns.structural.facade;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import models.User;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

import static consts.XMLConst.*;

@RequiredArgsConstructor
public class UserXMLCreator {

    @NonNull
    private User user;
    private Element root;
    private Document document;

    @SneakyThrows
    public void createXML(String destinationPath) {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        document = documentBuilder.newDocument();
        root = document.createElement(USER);
        document.appendChild(root);

        createChildNode(NAME, user.getName());
        createChildNode(AGE, user.getAge());
        createChildNode(ID, user.getId());

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File(destinationPath));
        transformer.transform(domSource, streamResult);
    }

    private void createChildNode(String nodeName, Object nodeValue) {
        Element element = document.createElement(nodeName);
        element.appendChild(document.createTextNode(String.valueOf(nodeValue)));
        root.appendChild(element);
    }
}
