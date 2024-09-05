package ch.iet_gibb;

import ch.iet_gibb.model.SquareTank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Levyn Schneider
 * @version 1.1.0
 * @since 1.0.0
 */
public class SquareTankTest {
    private SquareTank squareTank;

    @BeforeEach
    public void setUp() {
        squareTank = new SquareTank("Square Tank", 100.0, 100.0, 2.0);
    }

    @Test
    public void testConstructor() {
        assert squareTank.getName().equals("Square Tank");
        assert squareTank.getVolume() == 100.00;
        assert squareTank.getMaxTemperature() == 100.0;
        assert squareTank.getEnergyPerDay() == 2.0;
    }

    @Test
    public void testCalculateSavedEnergy() {
        assert squareTank.calculateSavedEnergy() == 8.940555555555555;
    }

    @Test
    public void testCalculateMaxDaysOfHeating() {
        assert squareTank.calculateMaxDaysOfHeating() == 4;
    }

    @Test
    public void testToString() {
        assert squareTank.toString().equals("Name: Square Tank\n" + "Fassungsvermögen: 100.0m³\n" + "Tägliche Energie: 2.0kWh\n" + "Gespeicherte Energie: 8.940555555555555kWh\n" + "Maximale Anzahl Heiztage: 4");
    }

    @Test
    public void testInvalidNameInput() {
        try {
            squareTank.setName("");
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Name darf nicht leer sein.");
        }
    }

    @Test
    public void testInvalidVolumeInput() {
        try {
            squareTank.setVolume(-1);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Volumen muss grösser als 0 sein.");
        }
    }

    @Test
    public void testInvalidMaxTemperatureInput() {
        try {
            squareTank.setMaxTemperature(29);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Maximale Temperatur muss mindestens 30 sein.");
        }
    }

    @Test
    public void testInvalidEnergyPerDayInput() {
        try {
            squareTank.setEnergyPerDay(-1);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Energie pro Tag muss grösser als 0 sein.");
        }
    }
}
