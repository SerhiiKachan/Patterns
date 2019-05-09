package patterns.structural.adapter.container;

import lombok.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import models.User;

import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class XMLContainerAdapter extends CSVContainer {

    private XMLContainer xmlContainer;

    @SneakyThrows
    @Override
    public List<User> parse() {
        List<User> users = new ArrayList<>();
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlContainer.getXmlPath());
        NodeList usersNodeList = document.getElementsByTagName("user");
        for (int i = 0; i < usersNodeList.getLength(); i++) {
            Element singleUser = (Element) usersNodeList.item(i);
            users.add(new User(singleUser.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue(),
                    Integer.parseInt(singleUser.getElementsByTagName("age").item(0).getChildNodes().item(0).getNodeValue()),
                    Long.parseLong(singleUser.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue())));
        }
        return users;
    }

}
