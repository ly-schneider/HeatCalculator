package ch.iet_gibb;

import ch.iet_gibb.model.CylindricalTank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Levyn Schneider
 * @version 1.1.0
 * @since 1.0.0
 */
public class CylindricalTankTest {
    private CylindricalTank cylindricalTank;

    @BeforeEach
    public void setUp() {
        cylindricalTank = new CylindricalTank("Cylindrical Tank", 100.0,100.0, 2.0);
    }

    @Test
    public void testConstructor() {
        assert cylindricalTank.getName().equals("Cylindrical Tank");
        assert cylindricalTank.getVolume() == 100.0;
        assert cylindricalTank.getMaxTemperature() == 100.0;
        assert cylindricalTank.getEnergyPerDay() == 2.0;
    }

    @Test
    public void testCalculateSavedEnergy() {
        assert cylindricalTank.calculateSavedEnergy() == 8.940555555555555;
    }

    @Test
    public void testCalculateMaxDaysOfHeating() {
        assert cylindricalTank.calculateMaxDaysOfHeating() == 4;
    }

    @Test
    public void testToString() {
        assert cylindricalTank.toString().equals("Name: Cylindrical Tank\n" + "Fassungsvermögen: 100.0m³\n" + "Tägliche Energie: 2.0kWh\n" + "Gespeicherte Energie: 8.940555555555555kWh\n" + "Maximale Anzahl Heiztage: 4");
    }

    @Test
    public void testInvalidNameInput() {
        try {
            cylindricalTank.setName("");
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Name darf nicht leer sein.");
        }
    }

    @Test
    public void testInvalidVolumeInput() {
        try {
            cylindricalTank.setVolume(-1);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Volumen muss grösser als 0 sein.");
        }
    }

    @Test
    public void testInvalidMaxTemperatureInput() {
        try {
            cylindricalTank.setMaxTemperature(29);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Maximale Temperatur muss mindestens 30 sein.");
        }
    }

    @Test
    public void testInvalidEnergyPerDayInput() {
        try {
            cylindricalTank.setEnergyPerDay(-1);
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Energie pro Tag muss grösser als 0 sein.");
        }
    }
}
