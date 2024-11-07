package shapes;
public class StripedLine extends Shape {

    public StripedLine(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawStripedLine(number);
    }

    public static void drawStripedLine(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.print("* ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

}
