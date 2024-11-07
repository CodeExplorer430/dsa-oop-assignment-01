package shapes;

public class ParallelogramCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new Parallelogram(number);
    }    
}
