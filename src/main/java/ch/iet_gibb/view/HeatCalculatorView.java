package ch.iet_gibb.view;

import ch.iet_gibb.model.Tank;

import java.util.ArrayList;

/**
 * @author Levyn Schneider
 * @version 1.0.0
 */
public class HeatCalculatorView {
    private final ArrayList<Tank> models; // Array of Tank objects

    /**
     * Default constructor
     *
     * @param models the models to display
     */
    public HeatCalculatorView(ArrayList<Tank> models) {
        this.models = models;
    }

    /**
     * Display the models
     */
    public void display() {
        for (Tank model : models) {
            System.out.println("\n" + model);
        }
    }
}
