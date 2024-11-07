package shapes;

public class HourGlassCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new HourGlass(number);
    }
}
