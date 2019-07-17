package ku.p1;

public class WhileDoLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            if(i == 5){
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            if(i%2 == 0){
                continue;
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
