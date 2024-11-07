package utils;

import java.util.Scanner;
import shapes.ShapeOption;

public class InputValidator {
    
    private static final int MINIMUM_ODD_NUMBER = 3;
    private static final int MAX_NUMBER = 100;
    private final Scanner scanner;
    private final MessageHandler messageHandler;

    public InputValidator(Scanner scanner, MessageHandler messageHandler) {
        this.scanner = scanner;
        this.messageHandler = messageHandler;
    }

    /**
     * Prompts the user for an odd number within the specified range and returns
     * the input after validating it.
     * @return An odd number within the range of 3 and 100 (inclusive)
     */
    public int getValidOddNumber() {
        int number;
        do {
            number = promptForInt("Enter a number: ");
        } while (!isOddInRange(number));
        return number;
    }
    
    /**
     * Prompts the user for a choice of shape option and returns the choice after
     * validating it.
     * @return The choice of shape option (1-indexed)
     */
    public int getUserShapeChoice() {
        int choice;
        do {
            choice = promptForInt("Select a number: ");
        } while (!isChoiceInRange(choice, 1, ShapeOption.values().length));
        return choice;
    }
    
    // Helper method to prompt for an integer with basic validation
    private int promptForInt(String message) {
        messageHandler.showMessage(message);
        while (!scanner.hasNextInt()) {
            messageHandler.showError("That's not a valid number! Please try again.");
            scanner.next(); // Clear invalid input
            messageHandler.showMessage(message);
        }
        return scanner.nextInt();
    }

    // Checks if the provided number is odd and within the defined range
    private boolean isOddInRange(final int number) {
        if (number < MINIMUM_ODD_NUMBER || number > MAX_NUMBER || number % 2 == 0) {
            messageHandler.showError("Invalid choice. Please enter an odd number between " + MINIMUM_ODD_NUMBER + " and " + MAX_NUMBER + ".");
            return false;
        }
        return true;
    }

    // Checks if the provided choice is within a specified range
    private boolean isChoiceInRange(final int choice, final int min, final int max) {
        if (choice < min || choice > max) {
            messageHandler.showError("Invalid choice. Please enter a number between " + min + " and " + max + ".");
            return false;
        }
        return true;
    }
}
