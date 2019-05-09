package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import enums.NotificationType;

@Getter
@AllArgsConstructor
public class Notification {
    private NotificationType type;
    private String text;
}
