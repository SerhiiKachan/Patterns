package patterns.structural.decorator;

import com.opencsv.CSVWriter;
import lombok.SneakyThrows;
import models.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HeaderDecorator extends FileDecorator{

    public HeaderDecorator(Data data) {
        super(data);
    }

    @Override
    public List<User> readData(String path) {
        return this.data.readData(path);
    }

    @Override
    @SneakyThrows
    public void writeData(String newFilePath, User[] users) {
        Writer writer = Files.newBufferedWriter(Paths.get(newFilePath));
        CSVWriter csvWriter = new CSVWriter(writer);
        csvWriter.writeNext(new String[]{"NAME", "AGE", "ID"});
        for (User u : users) {
            csvWriter.writeNext(new String[]{u.getName(), String.valueOf(u.getAge()), String.valueOf(u.getId())});
        }
        csvWriter.flush();
        csvWriter.close();
    }
}
