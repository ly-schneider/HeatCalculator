package ch.iet_gibb;

import ch.iet_gibb.model.CylindricalTank;
import ch.iet_gibb.model.SquareTank;
import ch.iet_gibb.model.Tank;

import java.util.Scanner;

/**
 * @author Levyn Schneider
 * @version 1.0.1
 * @since 1.0.0
 */
public class Main {
    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SquareTank squareTank = new SquareTank();

        /* Square Tank setup */
        System.out.println("Quadratischer Tank");
        System.out.print("Name: ");
        squareTank.setName(scanner.nextLine());

        System.out.print("Breite (m): ");
        squareTank.setWidth(scanner.nextDouble());

        System.out.print("Höhe (m): ");
        squareTank.setHeight(scanner.nextDouble());

        System.out.print("Länge (m): ");
        squareTank.setLength(scanner.nextDouble());

        System.out.print("Maximale Temperatur (C): ");
        squareTank.setMaxTemperature(scanner.nextDouble());

        System.out.print("Energie pro Tag (kWh): ");
        squareTank.setEnergyPerDay(scanner.nextDouble());

        System.out.println("\n" + squareTank);

        scanner.nextLine();

        /* Cylindrical Tank setup */
        CylindricalTank cylindricalTank = new CylindricalTank();

        System.out.println("\nZylindrischer Tank");
        System.out.print("Name: ");
        cylindricalTank.setName(scanner.nextLine());

        System.out.print("Radius (m): ");
        cylindricalTank.setRadius(scanner.nextDouble());

        System.out.print("Höhe (m): ");
        cylindricalTank.setHeight(scanner.nextDouble());

        System.out.print("Maximale Temperatur (C): ");
        cylindricalTank.setMaxTemperature(scanner.nextDouble());

        System.out.print("Energie pro Tag (kWh): ");
        cylindricalTank.setEnergyPerDay(scanner.nextDouble());

        System.out.println("\n" + cylindricalTank);

        scanner.nextLine();

        /* Tank setup */
        Tank tank = new Tank();

        System.out.println("\nTank");
        System.out.print("Name: ");
        tank.setName(scanner.nextLine());

        System.out.print("Volumen (m³): ");
        tank.setVolume(scanner.nextDouble());

        System.out.print("Maximale Temperatur (C): ");
        tank.setMaxTemperature(scanner.nextDouble());

        System.out.print("Energie pro Tag (kWh): ");
        tank.setEnergyPerDay(scanner.nextDouble());

        System.out.println("\n" + tank);

        scanner.close();
    }
}