package ku.p1;

public class ExCheckPrime {

    public static boolean checkPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPrime=checkPrime(11);
        System.out.println(isPrime);
    }

}
