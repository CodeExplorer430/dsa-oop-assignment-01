package shapes;
public class Bowtie extends Shape {

    public Bowtie(int number) {
        super(number);
    }

    @Override
    public void draw() {
        drawBowtie(number);
    }

    public static void drawBowtie(int number) {
        int mid = number / 2;
        for (int i = 0; i < number; i++) {
            int limit = (i <= mid) ? i : number - i - 1;
            for (int j = 0; j < number; j++) {
                if (j <= limit || j >= number - limit - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
