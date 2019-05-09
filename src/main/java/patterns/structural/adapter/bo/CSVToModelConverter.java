package patterns.structural.adapter.bo;

import patterns.structural.adapter.container.CSVContainer;
import models.User;

import java.util.List;

public class CSVToModelConverter {

    public static List<User> getUsers(CSVContainer csvContainer) {
        return csvContainer.parse();
    }

}
