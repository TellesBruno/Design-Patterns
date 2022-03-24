package structuralpatterns.facade.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Box {
    private String size;
    private double weight;
    private boolean isFragile;
}
