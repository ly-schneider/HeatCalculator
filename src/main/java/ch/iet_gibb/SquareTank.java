package ch.iet_gibb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Levyn Schneider
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SquareTank {
    private String name;
    private double width;
    private double height;
    private double length;
    private double maxTemperature;
    private double energyPerDay;

    /**
     * @return Die gespeicherte Energie
     */
    public double calculateSavedEnergy() {
        double specificHeatCapacity = 4.186; // in J/(kg*K)

        double volume = width * height * length;

        double mass = volume * 1000; // angenommene Dichte 1000 kg/m³

        double temperatureDifference = maxTemperature - 0;

        return mass * specificHeatCapacity * temperatureDifference; // Q = m * c * ΔT
    }

    /**
     * @return Die maximale Anzahl an Heiztagen
     */
    public int calculateMaxDaysOfHeating() {
        return (int) Math.floor(calculateSavedEnergy() / energyPerDay);
    }
}