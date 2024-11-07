package shapes;

public class ArrowDownCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new ArrowDown(number);
    }
}
