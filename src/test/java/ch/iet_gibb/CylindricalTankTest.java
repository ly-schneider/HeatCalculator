package ch.iet_gibb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Levyn Schneider
 * @version 1.0.0
 * @since 1.0.0
 */
public class CylindricalTankTest {
    private CylindricalTank cylindricalTank;

    @BeforeEach
    public void setUp() {
        cylindricalTank = new CylindricalTank("Cylindrical Tank", 10.0, 30.0, 100.0, 2.0);
    }

    @Test
    public void testConstructor() {
        assert cylindricalTank.getName().equals("Cylindrical Tank");
        assert cylindricalTank.getRadius() == 10.0;
        assert cylindricalTank.getHeight() == 30.0;
        assert cylindricalTank.getMaxTemperature() == 100.0;
        assert cylindricalTank.getEnergyPerDay() == 2.0;
    }

    @Test
    public void testCalculateSavedEnergy() {
        assert cylindricalTank.calculateSavedEnergy() == 842.6275095703423;
    }

    @Test
    public void testCalculateVolume() {
        assert cylindricalTank.calculateVolume() == 9424.77796076938;
    }

    @Test
    public void testCalculateMaxDaysOfHeating() {
        assert cylindricalTank.calculateMaxDaysOfHeating() == 421;
    }

    @Test
    public void testToString() {
        assert cylindricalTank.toString().equals("Fassungsvermögen: 9424.77796076938m³\n" +
                "Gespeicherte Energie: 842.6275095703423kWh\n" +
                "Maximale Anzahl Heiztage: 421");
    }
}
