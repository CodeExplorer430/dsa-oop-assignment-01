package main;

import java.util.Scanner;
import utils.InputValidator;
import utils.MessageHandler;

public class Main {
    /**
     * Entry point of the program.
     * Creates an InputValidator object that validates user input.
     * Creates a ShapeManager object that uses the InputValidator to validate user input.
     * Starts the drawing process by calling the startDrawingProcess() method on the ShapeManager object.
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             MessageHandler messageHandler = new MessageHandler();
             InputValidator validator = new InputValidator(scanner, messageHandler);
             ShapeManager shapeManager = new ShapeManager(validator);

             // Start the drawing process which includes printing menu, validation, and drawing
             shapeManager.startDrawingProcess();
        } 
     }
 }
