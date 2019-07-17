package ku.p1;

import java.util.Scanner;

public class soilPH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter soil PH: ");

        double inputPH = scanner.nextDouble();

        if (inputPH <= 6) {
            System.out.println("PH level: acidic");
        } else if (inputPH > 6 && inputPH < 7.9) {
            System.out.println("PH level: neutral");
        } else  {
            System.out.println("PH level: basic");
        }
    }
}
