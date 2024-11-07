package shapes;

public class SquareCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new Square(number);
    }
}
