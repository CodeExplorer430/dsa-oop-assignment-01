package shapes;
public class ReverseTriangle extends Shape {
    public ReverseTriangle(int number) {
        super(number);
    }
    
    @Override
    public void draw() {
        drawReverseTriangle(number);
    }

    public static void drawReverseTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
