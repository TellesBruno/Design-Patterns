package structuralpatterns.adapter.utils;

public class UnityConverter {
    public double milesToKilometers(double miles) {
        return miles * 1.6;
    }

    public double kilometersToMiles(double kilometers) {
        return kilometers * 0.62;
    }

    public double poundsToKilograms(double pounds) {
        return pounds * 0.45;
    }

    public double kilogramsToPounds(double kilograms) {
        return kilograms * 2.2;
    }
}
