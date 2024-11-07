package utils;

import shapes.ShapeOption;

public class Menu {
    /**
     * Prints a menu of ShapeOptions to the console.
     * Each option is formatted as "[number] description" where number is the
     * one-based index of the option in the ShapeOption enum and description
     * is the description of the option.
     */
    public static void printMenu() {
        System.out.println("Shape Drawing");
        for (int i = 0; i < ShapeOption.values().length; i++) {
            System.out.printf("\t[%2d] %s\n", i + 1, ShapeOption.values()[i].getDescription());
        }
    }
}
