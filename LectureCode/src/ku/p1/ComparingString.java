package ku.p1;


public class ComparingString {

    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");

        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1 == str3);


    }
}
