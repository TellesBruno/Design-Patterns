package structuralpatterns.adapter.converters;

import structuralpatterns.adapter.trucks.ImperialTruck;
import structuralpatterns.adapter.trucks.MetricTruck;
import structuralpatterns.adapter.utils.UnityConverter;

public class TruckConverter {
    UnityConverter unityConverter = new UnityConverter();

    public MetricTruck convertToMetric(ImperialTruck truck) {
        return new MetricTruck(
                unityConverter.milesToKilometers(truck.getMileage()),
                unityConverter.poundsToKilograms(truck.getWeight()),
                unityConverter.poundsToKilograms(truck.getCapacity()));
    }

    public ImperialTruck convertToImperial(MetricTruck truck) {
        return new ImperialTruck(
                unityConverter.kilometersToMiles(truck.getKilometrage()),
                unityConverter.kilogramsToPounds(truck.getWeight()),
                unityConverter.kilogramsToPounds(truck.getCapacity()));
    }
}
