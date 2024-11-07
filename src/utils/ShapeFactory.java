package utils;

import shapes.*;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShapeFactory {
    private static final Logger LOGGER = Logger.getLogger(ShapeFactory.class.getName());
    private final Map<ShapeOption, Supplier<Shape>> shapeCreators = new EnumMap<>(ShapeOption.class);
    private final int number;

    public ShapeFactory(int number) {
        this.number = number;
        initializeFactory();
    }
    

    /**
     * Initializes the shapeCreators map with suppliers for each ShapeOption.
     * Each supplier creates a corresponding Shape object with the specified
     * size when invoked. This setup allows for easy retrieval and creation
     * of Shape instances based on user-selected shape options.
     */
    private void initializeFactory() {
        shapeCreators.put(ShapeOption.LINE, () -> new LineCreator().createShape(number));
        shapeCreators.put(ShapeOption.STRIPED_LINE, () -> new StripedLineCreator().createShape(number));
        shapeCreators.put(ShapeOption.SQUARE, () -> new SquareCreator().createShape(number));
        shapeCreators.put(ShapeOption.PARALLELOGRAM, () -> new ParallelogramCreator().createShape(number));
        shapeCreators.put(ShapeOption.TRIANGLE, () -> new TriangleCreator().createShape(number));
        shapeCreators.put(ShapeOption.REVERSE_TRIANGLE, () -> new ReverseTriangleCreator().createShape(number));
        shapeCreators.put(ShapeOption.ISOCELES_TRIANGLE, () -> new IsocelesTriangleCreator().createShape(number));
        shapeCreators.put(ShapeOption.REVERSE_ISOCELES_TRIANGLE, () -> new ReverseIsocelesTriangleCreator().createShape(number));
        shapeCreators.put(ShapeOption.HOUR_GLASS, () -> new HourGlassCreator().createShape(number));
        shapeCreators.put(ShapeOption.DIAMOND, () -> new DiamondCreator().createShape(number));
        shapeCreators.put(ShapeOption.ZERO, () -> new ZeroCreator().createShape(number));
        shapeCreators.put(ShapeOption.ARROW_UP, () -> new ArrowUpCreator().createShape(number));
        shapeCreators.put(ShapeOption.ARROW_DOWN, () -> new ArrowDownCreator().createShape(number));
        shapeCreators.put(ShapeOption.X_SHAPE, () -> new XCreator().createShape(number));
        shapeCreators.put(ShapeOption.BOWTIE, () -> new BowtieCreator().createShape(number));
    }

    /**
     * Returns a Shape object based on the given ShapeOption.
     * If the given ShapeOption is not found in the shapeCreators map, an
     * IllegalArgumentException is thrown.
     * @param option The ShapeOption for which to create a Shape object.
     * @return A Shape object corresponding to the given ShapeOption.
     * @throws IllegalArgumentException if the given ShapeOption is invalid.
     */
    public Shape getShape(ShapeOption option, int number) {
        Supplier<Shape> shapeCreator = shapeCreators.get(option);
        if (shapeCreator == null) {
            LOGGER.log(Level.WARNING, "Invalid shape choice: " + option);
            throw new IllegalArgumentException("Invalid shape choice.");
        }
        return shapeCreator.get();
    }
}
