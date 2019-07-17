package ku.p1;

public class PassByValueExample {

    public static void main(String[] args) {

        int x = 1, y=1;
        PassByValueExample.method1(x,y);
        System.out.println("x: "+x+" y:"+y);

        Rectangle rec = new Rectangle(1,1);
        PassByValueExample.method2(rec);
        System.out.println("rec.height: "+rec.height+" rec.width: "+rec.width);

        rec = new Rectangle(1,1);
        PassByValueExample.method3(rec);
        System.out.println("rec.height: "+rec.height+" rec.width: "+rec.width);

    }

    public static void method1 (int x, int y){
        x = 1000;
        y = 1000;
    }

    public static void method2 (Rectangle rec){
        rec.height = 1000;
        rec.width = 1000;
    }

     public static void method3 (Rectangle rec) {
        rec.height = 100;
//        rec = new Rectangle(rec);
        rec.height = 1000;
        rec.width = 1000;
    }

}
