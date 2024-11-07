package shapes;
public class IsocelesTriangle extends Shape {
    public IsocelesTriangle(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawIsocelesTriangle(number);
    }

    public static void drawIsocelesTriangle(int number) {
        int mid = number / 2;
        for (int i = 0; i <= mid; i++) {
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
