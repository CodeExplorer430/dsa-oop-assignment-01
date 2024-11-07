package shapes;

public class StripedLineCreator implements ShapeCreator{
    @Override
    public Shape createShape(int number) {
        return new StripedLine(number);
    }
}
