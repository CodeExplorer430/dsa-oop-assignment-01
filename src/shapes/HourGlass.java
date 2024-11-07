package shapes;
public class HourGlass extends Shape {
    public HourGlass(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawHourGlass(number);
    }

    public static void drawHourGlass(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i < number / 2) {
                    if (j < number / 2 - i || j >= number / 2 + i + 1) {
                        System.out.print("_ ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if (j < i - number / 2 + 1 || j >= number - i + number / 2) {
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