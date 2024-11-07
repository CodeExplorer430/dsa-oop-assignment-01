package shapes;

public abstract class Shape {
    protected int number;

    public Shape(int number) {
        this.number = number;
    }

    public abstract void draw();
}