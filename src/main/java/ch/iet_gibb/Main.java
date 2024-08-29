package ch.iet_gibb;

import java.util.Scanner;

/**
 * @author Levyn Schneider
 */
public class Main {
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
    }
}