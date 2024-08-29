package ch.iet_gibb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Levyn Schneider
 * @version 1.0.0
 * @since 1.0.0
 */
public class SquareTankTest {
    private SquareTank squareTank;

    @BeforeEach
    public void setUp() {
        squareTank = new SquareTank("Square Tank", 10.0, 30.0, 20.0, 100.0, 2.0);
    }

    @Test
    public void testConstructor() {
        assert squareTank.getName().equals("Square Tank");
        assert squareTank.getWidth() == 10.0;
        assert squareTank.getHeight() == 30.0;
        assert squareTank.getLength() == 20.0;
        assert squareTank.getMaxTemperature() == 100.0;
        assert squareTank.getEnergyPerDay() == 2.0;
    }

    @Test
    public void testCalculateSavedEnergy() {
        assert squareTank.calculateSavedEnergy() == 536.4333333333333;
    }

    @Test
    public void testCalculateVolume() {
        assert squareTank.calculateVolume() == 6000.0;
    }

    @Test
    public void testCalculateMaxDaysOfHeating() {
        assert squareTank.calculateMaxDaysOfHeating() == 268;
    }

    @Test
    public void testToString() {
        assert squareTank.toString().equals("Fassungsvermögen: 6000.0m³\n" +
                "Gespeicherte Energie: 536.4333333333333kWh\n" +
                "Maximale Anzahl Heiztage: 268");
    }
}
