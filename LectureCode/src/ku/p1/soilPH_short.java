package ku.p1;

public class soilPH_short {
    public static void main(String[] args) {
        Rectangle[] recArray = {new Rectangle(1, 1), new Rectangle(2, 2), new Rectangle(3, 3)};

        for (Rectangle rec : recArray) {
            System.out.println(rec.width + "," + rec.height);
        }

    }
}
