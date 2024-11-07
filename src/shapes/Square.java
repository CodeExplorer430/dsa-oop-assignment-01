package shapes;
public class Square extends Shape {
    public Square(int number) {
        super(number);
    }
    
    @Override
    public void draw() {
        drawSquare(number);
    }

    public static void drawSquare(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
