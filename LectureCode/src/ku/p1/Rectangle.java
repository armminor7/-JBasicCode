package ku.p1;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0.0,0.0);
    }


    public double getArea(){
        return width*height;
    }


}
