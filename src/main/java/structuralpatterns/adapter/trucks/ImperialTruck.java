package structuralpatterns.adapter.trucks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString
public class ImperialTruck {
    private double mileage;
    private double weight;
    private double capacity;
}
