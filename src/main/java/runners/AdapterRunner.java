package runners;

import patterns.structural.adapter.bo.CSVToModelConverter;
import patterns.structural.adapter.container.CSVContainer;
import patterns.structural.adapter.container.XMLContainer;
import patterns.structural.adapter.container.XMLContainerAdapter;
import models.User;

import java.util.List;

public class AdapterRunner {

    public static void main(String[] args) {
        CSVContainer csvContainer = new CSVContainer("./src/main/resources/test.csv");
        CSVContainer xmlContainer = new XMLContainerAdapter(new XMLContainer("./src/main/resources/test.xml"));

        List<User> users = CSVToModelConverter.getUsers(xmlContainer);
        users.forEach(System.out::println);
    }

}
