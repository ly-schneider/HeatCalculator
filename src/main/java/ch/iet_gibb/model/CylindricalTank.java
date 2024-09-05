package ch.iet_gibb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Levyn Schneider
 * @version 1.0.1
 * @since 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CylindricalTank {
    private String name;
    private double radius;
    private double height;
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
     * Calculates the volume of the cylindrical tank in m³.
     *
     * @return the volume of the cylindrical tank in m³
     */
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
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
        return "Name: " + name + "\n" +
                "Fassungsvermögen: " + calculateVolume() + "m³\n" +
                "Tägliche Energie: " + energyPerDay + "kWh\n" +
                "Gespeicherte Energie: " + calculateSavedEnergy() + "kWh\n" +
                "Maximale Anzahl Heiztage: " + calculateMaxDaysOfHeating();
    }

    /**
     * Sets the name of the tank.
     *
     * @param name the name of the tank
     */
    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name darf nicht leer sein.");
        }
        this.name = name;
    }

    /**
     * Sets the radius of the tank.
     *
     * @param radius the radius of the tank
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius muss grösser als 0 sein.");
        }
        this.radius = radius;
    }

    /**
     * Sets the height of the tank.
     *
     * @param height the height of the tank
     */
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Höhe muss grösser als 0 sein.");
        }
        this.height = height;
    }

    /**
     * Sets the maximum temperature of the tank.
     *
     * @param maxTemperature the maximum temperature of the tank
     */
    public void setMaxTemperature(double maxTemperature) {
        if (maxTemperature < 30) {
            throw new IllegalArgumentException("Maximale Temperatur muss mindestens 30 sein.");
        }
        this.maxTemperature = maxTemperature;
    }

    /**
     * Sets the energy per day of the tank.
     *
     * @param energyPerDay the energy per day of the tank
     */
    public void setEnergyPerDay(double energyPerDay) {
        if (energyPerDay <= 0) {
            throw new IllegalArgumentException("Energie pro Tag muss grösser als 0 sein.");
        }
        this.energyPerDay = energyPerDay;
    }
}
