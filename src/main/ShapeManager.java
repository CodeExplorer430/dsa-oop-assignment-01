package main;

import shapes.Shape;
import shapes.ShapeOption;
import utils.InputValidator;
import utils.Menu;
import utils.ShapeFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class ShapeManager {
    private static final Logger LOGGER = Logger.getLogger(ShapeManager.class.getName());
    private final InputValidator validator;

    static {
        try {
            FileHandler fileHandler = new FileHandler("shapeManager.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Failed to set up file handler for logging.", e);
        }
    }

    public ShapeManager(InputValidator validator) {
        this.validator = validator;
    }

    /**
     * Starts the drawing process by prompting the user for a valid odd number,
     * printing the menu of ShapeOptions, prompting the user for a choice, and
     * drawing the selected shape.
     */
    public void startDrawingProcess() {
        int number = validator.getValidOddNumber(); // Odd number input
        Menu.printMenu();
        int choice = validator.getUserShapeChoice();

        try {
            ShapeOption selectedOption = ShapeOption.fromChoice(choice);
            ShapeFactory shapeFactory = new ShapeFactory(number);
            Shape shape = shapeFactory.getShape(selectedOption, number);

            shape.draw(); // Call the draw method of the selected shape
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.SEVERE, "Error in shape selection or drawing process." + e);
            System.out.println("An error occurred while trying to draw the shape. Please check your input and try again.");
        }
    }
}
