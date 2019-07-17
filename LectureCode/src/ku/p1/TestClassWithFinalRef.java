package ku.p1;

public class TestClassWithFinalRef {
    public static void main(String[] args) {
        ClassWithFinalRef.REC.width = 4;
        ClassWithFinalRef.REC.height = 5;

        Rectangle rec1 = new Rectangle(4,5);
//        ClassWithFinalRef.REC = rec1;

    }
}
