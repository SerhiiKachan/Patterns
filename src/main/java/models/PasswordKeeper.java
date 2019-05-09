package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@Getter
@Setter
@AllArgsConstructor
public class PasswordKeeper {

    private String pass;

    public void deletePassword() {
        pass = EMPTY;
    }
}
