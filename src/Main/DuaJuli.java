package Main;

public class DuaJuli {
    public static void main(String[] args) {
        int a = 3;
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
