package runners;

import models.User;
import patterns.behavioural.templatemethod.CSVFile;
import patterns.behavioural.templatemethod.Data;
import patterns.behavioural.templatemethod.HeaderCSVFile;
import patterns.structural.adapter.bo.CSVToModelConverter;
import patterns.structural.adapter.container.CSVContainer;

import java.util.List;

public class TemplateMethodRunner {

    public static void main(String[] args) {
        List<User> objects = CSVToModelConverter.getUsers(new CSVContainer("./src/main/resources/test.csv"));
        User[] users = objects.toArray(new User[objects.size()]);


        Data csv = new CSVFile();
        Data headercsv = new HeaderCSVFile();

        csv.writeData("./src/main/resources/simple.csv", users);
        headercsv.writeData("./src/main/resources/header.csv", users);
    }

}
