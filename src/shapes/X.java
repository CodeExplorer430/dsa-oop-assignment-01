package shapes;
public class X extends Shape {

    public X(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawX(number);
    }

    public static void drawX(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j || j == number - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
