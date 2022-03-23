package creationalpatterns.builder.products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class House {
    private String wall;
    private Integer wallNunber;
    private String door;
    private Integer doorNunber;
    private String window;
    private Integer windowNunber;
    private String roof;
    private Boolean garage;
    private Boolean pool;


}
