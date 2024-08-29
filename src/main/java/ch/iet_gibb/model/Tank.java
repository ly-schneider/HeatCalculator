package ch.iet_gibb.model;

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
public class Tank {
    private String name;
    private double volume;
    private double maxTemperature;
    private double energyPerDay;

    /**
     * Returns the stored energy in the tank.
     *
     * @return Energy in kWh
     */
    public double calculateSavedEnergy() {
        return volume * 4.18 * (maxTemperature - 23) / 3600.0;
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
                "Fassungsvermögen: " + volume + "m³\n" +
                "Tägliche Energie: " + energyPerDay + "kWh\n" +
                "Gespeicherte Energie: " + calculateSavedEnergy() + "kWh\n" +
                "Maximale Anzahl Heiztage: " + calculateMaxDaysOfHeating();
    }

    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name darf nicht leer sein.");
        }
        this.name = name;
    }

    public void setVolume(double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Volumen muss grösser als 0 sein.");
        }
        this.volume = volume;
    }

    public void setMaxTemperature(double maxTemperature) {
        if (maxTemperature < 30) {
            throw new IllegalArgumentException("Maximale Temperatur muss mindestens 30 sein.");
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
