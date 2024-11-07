package shapes;

public enum ShapeOption {
    LINE("Draw Line"),
    STRIPED_LINE("Draw Stripe Line"),
    SQUARE("Draw Square"),
    PARALLELOGRAM("Draw Parallelogram"),
    TRIANGLE("Draw Triangle"),
    REVERSE_TRIANGLE("Draw Reverse Triangle"),
    ISOCELES_TRIANGLE("Draw Isoceles Triangle"),
    REVERSE_ISOCELES_TRIANGLE("Draw Reverse Isoceles Triangle"),
    HOUR_GLASS("Draw Hour Glass"),
    DIAMOND("Draw Diamond"),
    ZERO("Draw Zero"),
    ARROW_UP("Draw Arrow Up"),
    ARROW_DOWN("Draw Arrow Down"),
    X_SHAPE("Draw X"),
    BOWTIE("Draw Bowtie");

    private final String description;

    ShapeOption(String description) {
        this.description = description;
    }

/**
 * Returns the description of the shape option.
 * 
 * @return A string describing the shape.
 */
    public String getDescription() {
        return description;
    }

    /**
     * Given a choice number, returns the corresponding ShapeOption.
     * The choice number is expected to be between 1 and the number of
     * ShapeOptions in the enum.
     * @param choice The choice number of the ShapeOption to be returned.
     * @return The ShapeOption with the given choice number.
     * @throws ArrayIndexOutOfBoundsException If the choice number is out of range.
     */
    public static ShapeOption fromChoice(int choice) {
        return values()[choice - 1];
    }
}
