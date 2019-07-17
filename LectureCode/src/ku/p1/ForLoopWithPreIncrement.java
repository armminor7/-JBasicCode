package ku.p1;

public class ForLoopWithPreIncrement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }

        int i = 0;
        int x = i++;
        int y = ++i;

        System.out.println(i+" "+x+" "+y);
    }

}
