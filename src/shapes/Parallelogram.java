package shapes;
public class Parallelogram extends Shape {
    public Parallelogram(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawParallelogram(number);
    }
    
    public static void drawParallelogram(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 2 * number - 1; j++) {
                if (j < number - i || j >= number + (number - 1 - i)) {
                    System.out.print("_ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
