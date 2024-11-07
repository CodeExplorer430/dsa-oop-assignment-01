package shapes;
public class ReverseIsocelesTriangle extends Shape {

    public ReverseIsocelesTriangle(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawReverseIsocelesTriangle(number);
    }

    public static void drawReverseIsocelesTriangle(int number) {
        int mid = number / 2;
        for (int i = mid; i >= 0; i--) {
            for (int j = 0; j < number; j++) {
                if (j < mid - i) {
                    System.out.print("_ ");
                } else if (j > mid + i) {
                    System.out.print("_ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
