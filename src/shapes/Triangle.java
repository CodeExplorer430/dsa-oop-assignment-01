package shapes;
public class Triangle extends Shape {
    public Triangle(int number) {
        super(number);
    }
    
    @Override
    public void draw() {
        drawTriangle(number);
    }

    public static void drawTriangle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j < number - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
