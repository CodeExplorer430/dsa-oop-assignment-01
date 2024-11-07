package shapes;

public class TriangleCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new Triangle(number);
    }
}
