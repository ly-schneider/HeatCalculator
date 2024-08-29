package ch.iet_gibb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Levyn Schneider
 * @version 1.0.0
 * @since 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SquareTank {
    private String name;
    private double width;
    private double height;
    private double length;
    private double maxTemperature;
    private double energyPerDay;

    /**
     * Returns the stored energy in the tank.
     *
     * @return Energy in kWh
     */
    public double calculateSavedEnergy() {
        return calculateVolume() * 4.18 * (maxTemperature - 23) / 3600.0;
    }

    /**
     * Calculates the volume of the square tank in m³.
     *
     * @return the volume of the square tank in m³
     */
    public double calculateVolume() {
        return width * height * length;
    }

    /**
     * Calculates the maximum number of heating days.
     *
     * @return the maximum number of heating days
     */
    public int calculateMaxDaysOfHeating() {
        return (int) Math.floor(calculateSavedEnergy() / energyPerDay);
    }

    @Override
    public String toString() {
        return "Fassungsvermögen: " + calculateVolume() + "m³\n" +
                "Gespeicherte Energie: " + calculateSavedEnergy() + "kWh\n" +
                "Maximale Anzahl Heiztage: " + calculateMaxDaysOfHeating();
    }

    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name darf nicht leer sein.");
        }
        this.name = name;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Breite muss grösser als 0 sein.");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Höhe muss grösser als 0 sein.");
        }
        this.height = height;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Länge muss grösser als 0 sein.");
        }
        this.length = length;
    }

    public void setMaxTemperature(double maxTemperature) {
        if (maxTemperature <= 0) {
            throw new IllegalArgumentException("Maximale Temperatur muss grösser als 0 sein.");
        }
        this.maxTemperature = maxTemperature;
    }

    public void setEnergyPerDay(double energyPerDay) {
        if (energyPerDay <= 0) {
            throw new IllegalArgumentException("Energie pro Tag muss grösser als 0 sein.");
        }
        this.energyPerDay = energyPerDay;
    }
}