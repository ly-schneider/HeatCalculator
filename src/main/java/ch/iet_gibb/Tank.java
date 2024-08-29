package ch.iet_gibb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Levyn Schneider
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tank {
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
}
