package shapes;

public class BowtieCreator implements ShapeCreator {
    @Override
    public Shape createShape(int number) {
        return new Bowtie(number);
    }
}
