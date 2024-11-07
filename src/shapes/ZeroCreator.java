package shapes;

public class ZeroCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new Zero(number);
    }   
}
