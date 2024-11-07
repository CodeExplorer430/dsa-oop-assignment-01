package shapes;
public class ArrowDown extends Shape {
    public ArrowDown(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawArrowDown(number);
    }

    public static void drawArrowDown(int number) {
        int mid = number / 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i < mid) {
                    if (j < mid - 2 || j > mid + 2) {
                        System.out.print("_ ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if (j >= mid - (number - i - 1) && j <= mid + (number - i - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("_ ");
                    }
                }
            }
            System.out.println();
        }
    }
}
