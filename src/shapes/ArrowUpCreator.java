package shapes;

public class ArrowUpCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new ArrowUp(number);
    }
}
