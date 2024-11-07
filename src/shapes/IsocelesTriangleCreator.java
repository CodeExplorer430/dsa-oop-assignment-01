package shapes;

public class IsocelesTriangleCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new IsocelesTriangle(number);
    }
}
