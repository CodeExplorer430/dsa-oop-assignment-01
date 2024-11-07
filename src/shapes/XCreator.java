package shapes;

public class XCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new X(number);
    }
}