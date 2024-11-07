package shapes;
public class ArrowUp extends Shape {
    public ArrowUp(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawArrowUp(number);
    }
    
    public static void drawArrowUp(int number) {
        int offset = 2;
        int mid = number / 2;

        for (int i = 0; i <= mid + offset + 2; i++) {
            for (int j = 0; j < number; j++) {
                if (i <= mid) {
                    if (j >= mid - i && j <= mid + i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("_ ");
                    }
                } else {
                    if (j < mid - offset || j > mid + offset) {
                        System.out.print("_ ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}
