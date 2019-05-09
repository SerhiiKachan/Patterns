package models;

import lombok.*;

@ToString
@Getter
@AllArgsConstructor
public class User {
    private String name;
    private int age;
    private long id;
}
