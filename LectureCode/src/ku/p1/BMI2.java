package ku.p1;

public class BMI2 extends BMI {

    public static double calBMI (double weight, double height){
        return (weight*100*100)/(height*height);
    }


//    public static double staticFinalCalBMI (double weight, double height){
//         return (weight*100*100)/(height*height);
//    }

    public static void main(String[] args) {
        System.out.println(BMI2.calBMI(60,172));
    }


}
