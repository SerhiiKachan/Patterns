package patterns.structural.proxy;

import lombok.Getter;
import lombok.Setter;
import enums.LockStatus;
import models.PasswordKeeper;

import java.util.Arrays;
import java.util.List;

import static enums.LockStatus.LOCKED;
import static enums.LockStatus.UNLOCKED;

@Getter
@Setter
public class ElectricLockContainer implements SecureContainer {

    private final String originalPassword;
    private PasswordKeeper keeper;
    private LockStatus lockStatus;
    private List<Object> content;

    public ElectricLockContainer(String password) {
        originalPassword = password;
        keeper = new PasswordKeeper(password);
        lockStatus = UNLOCKED;
        content = Arrays.asList("Money", "Keys", "FlashDevice");
    }

    @Override
    public void lock() {
        System.out.println("Current: " + lockStatus.getLocked() + " - LOCKING...");
        lockStatus = LOCKED;
        keeper.deletePassword();
    }

    @Override
    public void unlock() {
        System.out.println("Current: " + lockStatus.getLocked() + " - UNLOCKING...");
        if (keeper.getPass().isEmpty())
            System.out.println("You are locked. Enter the password and then unlock the container");
        else
            lockStatus = UNLOCKED;
    }

    @Override
    public void enterPassword(String password) {
        System.out.println("Current: " + lockStatus.getLocked() + " - ENTERING THE PASSWORD..." + "(" + password + ")");
        if (!originalPassword.equals(password))
            System.out.println("Wrong password! Try again");
        else {
            System.out.println("Correct password!");
            keeper.setPass(password);
        }
    }

    @Override
    public void viewContent() {
        System.out.println("Current: " + lockStatus.getLocked() + " - VIEWING CONTENT...");
        if (!keeper.getPass().isEmpty()) {
            System.out.println("{");
            content.forEach(System.out::println);
            System.out.println("}");
        } else
            System.out.println("Can not view the content. Enter the password and then unlock the container");
    }
}
