package shapes;
public class Zero extends Shape {

    public Zero(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawZero(number);
    }
    
    public static void drawZero(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 || i == number - 1 || j == 0 || j == number - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
