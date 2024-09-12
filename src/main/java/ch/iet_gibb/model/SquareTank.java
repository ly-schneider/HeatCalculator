package ch.iet_gibb.model;

/**
 * @author Levyn Schneider
 * @version 2.0.0
 */
public class SquareTank extends Tank {
    /**
     * Default constructor
     *
     * @param name           the name of the tank
     * @param volume         the volume of the tank
     * @param maxTemperature the maximum temperature of the tank
     * @param energyPerDay   the energy per day of the tank
     */
    public SquareTank(String name, double volume, double maxTemperature, double energyPerDay) {
        super(name, volume, maxTemperature, energyPerDay);
    }
}