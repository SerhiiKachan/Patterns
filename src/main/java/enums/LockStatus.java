package enums;

import lombok.Getter;

@Getter
public enum LockStatus {

    LOCKED("locked"),
    UNLOCKED("unlocked");

    private String locked;

    LockStatus(String locked) {
        this.locked = locked;
    }
}
