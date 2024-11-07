package shapes;
public class Diamond extends Shape {

    public Diamond(int number) {
        super(number);
    }
    
    @Override
    public void draw() {
        drawDiamond(number);
    }

    public static void drawDiamond(int number) {
        int mid = number / 2;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i <= mid && j >= mid - i && j <= mid + i) {
                    System.out.print("* ");
                } else if (i > mid && j >= i - mid && j < number - (i - mid)) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
