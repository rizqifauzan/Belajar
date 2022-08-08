package Main;

public class Test {
    public static void main(String args[]) {

        int Suhu = 60;

        if (Suhu == 0) {
            System.out.println("Beku");
        } else if (Suhu > 0 && Suhu < 30) {
            System.out.println("Dingin");
        } else if (Suhu >= 30 && Suhu < 40) {
            System.out.println("Hangat");
        } else if (Suhu >= 40 && Suhu < 70) {
            System.out.println("Panas");
        } else if (Suhu >= 70 && Suhu < 100) {
            System.out.println("Hampir Mendidih");
        } else if (Suhu >= 100 && Suhu < 120) {
            System.out.println("Mendidih");
        } else if (Suhu >= 120) {
            System.out.println("Gosong");
        }
    }
}
