package structuralpatterns.adapter;

import structuralpatterns.adapter.converters.TruckConverter;
import structuralpatterns.adapter.trucks.ImperialTruck;
import structuralpatterns.adapter.trucks.MetricTruck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TruckConverter converter = new TruckConverter();

        //Dados da API esterna
        List<ImperialTruck> ImportedTruck = new ArrayList<>();
        ImportedTruck.add(new ImperialTruck(10, 15400, 22000));
        ImportedTruck.add(new ImperialTruck(12641, 15400, 22000));
        ImportedTruck.add(new ImperialTruck(5, 11000, 55000));

        //Dados que serão usados na API interna
        List<MetricTruck> sellableTruck = new ArrayList<>();
        for (ImperialTruck truck : ImportedTruck) {
            sellableTruck.add(converter.convertToMetric(truck));
        }

        for (MetricTruck truck : sellableTruck) {
            System.out.println(truck);
        }
    }
}
