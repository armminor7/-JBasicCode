package ku.p1;

public class ExFactorial {

    public static long fact(long number) {

        long resFac = 1;
        for (int i = 1; i <= number; i++) {
            resFac = resFac * i;
        }
        return (resFac);

    }

    public static long factRecursive(long number) {
        if (number == 0) {
            return 1;
        } else {
            return number*factRecursive(number-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factRecursive(5));
    }


}
