package Main;

public class Looping {
    public static void main(String args[]){
        int a = 7;
        for (int b = 1; b <= a; b++){
            for (int c = 6; c >= b; c--){

                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++){
                System.out.println("x");
            }
            System.out.println();
        }
    }
}
