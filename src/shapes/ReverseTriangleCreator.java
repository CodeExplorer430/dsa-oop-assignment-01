package shapes;

public class ReverseTriangleCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new ReverseTriangle(number);
    }    
}
