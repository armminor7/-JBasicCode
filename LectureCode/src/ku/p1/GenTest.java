package ku.p1;

import java.util.Scanner;

public class GenTest {
    public static void main(String[] args) {


        //S13
        {
            System.out.println("\n####S13");
            Cat felix = new Cat(1, "black", "Male", 2.5);
            Cat nyan = new Cat(7, "rainbow-grey", "Male", 3);
            felix.meowing();
            nyan.purring();

        }

        //S30
        {
            System.out.println("\n####S30");
            String myString = "This is String";
            myString.length();
            System.out.println(myString + "1234");
            System.out.println(myString.concat("1234"));

            myString.substring(0, 6);
            myString.indexOf("ring");
            myString.toUpperCase();
            myString.toLowerCase();


        }

        //S31
        {
            System.out.println("\n####S31");
            String myString = "This is String";

            char x = myString.charAt(3);
            float y = 2.566f;
            double z = 8.997;

            System.out.println(y + z);
            System.out.println(x + y);
            System.out.println("" + x + y + z);
            System.out.println('A' + 'B');
        }

        for (char i = 'A'; i < 'G'; i++) {
            System.out.println(i);
        }

        //S32
        {
            System.out.println("\n####S32");
            String str1 = "ABC";
            String str2 = "ABC";
            String str3 = new String("ABC");

            System.out.println(str1 == str2);
            System.out.println(str1.equals(str2));

            System.out.println(str1 == str3);
            System.out.println(str1.equals(str3));

        }

        //S33
        {
            System.out.println("\n####S33");
            String x = "ABC";
            String y = x;
            y = "SSS";
            System.out.println(x);
            System.out.println(y);
        }

        //S34
        {
            System.out.println("\n####S34");
            final int MIN_IN_HOUR = 60;
            int numHours = 6;
            System.out.println(numHours + " hours = " + (MIN_IN_HOUR * numHours) + " minutes");

        }

        //s38
        {
            System.out.println("\n####S38");
            final Rectangle rec = new Rectangle(3.2, 1.1); //can we do this
            rec.height = 8.5; //?
            System.out.println(rec.height);
            //rec = new Rectangle(5.0, 5.0); //?
        }

        //S40
        {
            System.out.println("\n####S40");
            System.out.println(-5 + 8 * 6);
            System.out.println((55 + 9) % 9);
            System.out.println((20 + -3) * 5 / 8);
            System.out.println(5 + 15 / 3 * (2 - 8) % 3);
        }

        //S52
        {
            System.out.println("\n####S52");
            int i = 0;
            int x = i++;
            int y = ++i;
            System.out.println(i);
            System.out.println(x);
            System.out.println(y);
        }

        //S53
        {
            System.out.println("\n####S53");
            for (int i = 0; i < 10; i++) {
                boolean isEven = (i % 2 == 0);

                if (isEven = false) {
                    System.out.println(i + " is odd");
                }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        String str = ((i + j + k == 10) ? (i + "+" + j + "+" + k + " = 10") : "");
                        if (!str.isEmpty()) System.out.println(str);
                    }
                }
            }
        }

        //S54
        {
            System.out.println("\n####S54");
            String[] names = {"John", "Yuma", "Kim", "Dave"};

            for (String name : names) {
                System.out.println(name);
            }

            Rectangle[] recArray = {new Rectangle(1, 1), new Rectangle(2, 2), new Rectangle(3, 3)};

            for (Rectangle rec : recArray) {
                System.out.println(rec.width + "," + rec.height);
            }

        }

        //S55
        {
            System.out.println("\n####S55");

            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
                if (i == 5) {
                    break;
                }
            }

            System.out.println();

            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    System.out.print(i + " ");
                }
            }
        }

        //S57
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number 1-7:");

            int numDay = scanner.nextInt();


            switch (numDay) {
                case (1):
                    System.out.println("Monday");
                    break;
                case (2):
                    System.out.println("Tuesday");
                    break;
                case (3):
                    System.out.println("Wednesday");
                    break;
                case (4):
                    System.out.println("Thursday");
                    break;
                case (5):
                    System.out.println("Friday");
                    break;
                case (6):
                    System.out.println("Saturday");
                    break;
                case (7):
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day!...exiting...");
                    break;
            }

        }


    }
}
