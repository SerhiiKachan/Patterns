package patterns.structural.adapter.container;

import lombok.*;
import models.User;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CSVContainer {

    private String csvPath;

    @SneakyThrows
    public List<User> parse() {
        List<User> users = new ArrayList<>();
        for (String line : Files.readAllLines(Paths.get(csvPath))) {
            String[] singleUserData = line.split(",");
            users.add(new User(singleUserData[0], Integer.parseInt(singleUserData[1]), Long.parseLong(singleUserData[2])));
        }
        return users;
    }
}
