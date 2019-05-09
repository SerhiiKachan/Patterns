package runners;

import models.User;
import patterns.structural.facade.UserXMLCreator;

public class FacadeRunner {

    public static void main(String[] args) {
        User user = new User("Serhii", 22, 8569894);
        UserXMLCreator creator = new UserXMLCreator(user);
        creator.createXML("./src/main/resources/user.xml");
    }

}
