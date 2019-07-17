package ku.p1;

public class forLoopExcercise {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            boolean isEven = (i%2==0);

            if(isEven = false){
                System.out.println(i+" is odd");
            }

        }


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String str = ((i+j+k == 10)? (i+"+"+j+"+"+k+" = 10"):"");
                    if(!str.isEmpty()) System.out.println(str);
                }
            }
        }


    }
}
