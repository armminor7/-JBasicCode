package ku.p1;

public class BMI {

    public static void main(String[] args) {
        System.out.println(BMI.calBMI(60, 172));
    }

    public static double calBMI (double weight, double height){
        height = height/100;
        return weight/(height*height);
    }

    public final double finalCalBMI (double weight, double height){
        height = height/100;
        return weight/(height*height);
    }

    public static final double staticFinalCalBMI (double weight, double height){
        height = height/100;
        return weight/(height*height);
    }

}
