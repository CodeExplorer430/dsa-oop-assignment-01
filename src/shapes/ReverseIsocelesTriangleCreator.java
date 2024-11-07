package shapes;

public class ReverseIsocelesTriangleCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new ReverseIsocelesTriangle(number);
    }   
}
