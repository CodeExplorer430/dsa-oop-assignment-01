package shapes;

public class LineCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new Line(number);
    }
}
