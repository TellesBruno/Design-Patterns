package behavioralpatterns.chainofresponsability;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class User {
    private String userName;
    private String password;
    private String type;
    private Integer coffeCredit;
}
