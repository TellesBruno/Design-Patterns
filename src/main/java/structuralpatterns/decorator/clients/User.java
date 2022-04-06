package structuralpatterns.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class User {
    private String name;
    private int id;
    private String email;
    private String phone;

    private boolean enablePush;
    private boolean enableEmail;
    private boolean enableSms;

}
