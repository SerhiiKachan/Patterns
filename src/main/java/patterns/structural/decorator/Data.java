package patterns.structural.decorator;

import models.User;

import java.util.List;

public interface Data {
    List<User> readData(String path);
    void writeData(String newFilePath, User[] users);
}
