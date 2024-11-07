package shapes;

public class DiamondCreator implements ShapeCreator{
    @Override
    public Shape createShape(int number) {
        return new Diamond(number);
    }
}
