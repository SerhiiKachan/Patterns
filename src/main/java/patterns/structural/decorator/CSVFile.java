package patterns.structural.decorator;

import com.opencsv.CSVWriter;
import lombok.SneakyThrows;
import models.User;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFile implements Data {

    @Override
    @SneakyThrows
    public List<User> readData(String path) {
        List<User> users = new ArrayList<>();
        for (String line : Files.readAllLines(Paths.get(path))) {
            String[] singleUserData = line.split(",");
            users.add(new User(singleUserData[0], Integer.parseInt(singleUserData[1]), Long.parseLong(singleUserData[2])));
        }
        return users;
    }

    @Override
    @SneakyThrows
    public void writeData(String newFilePath, User[] users) {
        Writer writer = Files.newBufferedWriter(Paths.get(newFilePath));
        CSVWriter csvWriter = new CSVWriter(writer);
        for (User u : users) {
            csvWriter.writeNext(new String[]{u.getName(), String.valueOf(u.getAge()), String.valueOf(u.getId())});
        }
        csvWriter.flush();
        csvWriter.close();
    }
}
