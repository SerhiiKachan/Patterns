package runners;

import models.User;
import patterns.structural.adapter.bo.CSVToModelConverter;
import patterns.structural.adapter.container.CSVContainer;
import patterns.structural.decorator.CSVFile;
import patterns.structural.decorator.Data;
import patterns.structural.decorator.HeaderDecorator;

import java.util.List;

public class DecoratorRunner {

    public static void main(String[] args) {
        List<User> objects = CSVToModelConverter.getUsers(new CSVContainer("./src/main/resources/test.csv"));
        User[] users = objects.toArray(new User[objects.size()]);


        Data data = new HeaderDecorator(new CSVFile());
        data.writeData("./src/main/resources/decorator.csv", users);
    }

}
