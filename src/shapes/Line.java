package shapes;
public class Line extends Shape {
    public Line(int number) {
        super(number);
    }
    
    @Override
    public void draw() {
        drawLine(number);
    }
    
    public static void drawLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
