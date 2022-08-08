package Main;
//Print suhu
//      suhu = 0 -> print beku
//      suhu >0 dan < 30 -> print dingin
//      suhu >=30 dan <40 -> print hangat
//      suhu >=40 dan <70 -> print panas
//      suhu >=70 dan <100 -> print hampir mendidih
//      suhu >= 100 dan <120->  print mendidih
//      suhu >= 120  ->  print gosong

import java.util.Scanner;

public class TugasSuhu {
    public static void main(String args[]) {

        int Suhu = 122;
        String kategoriSuhu = String.valueOf(Suhu);

        if (Suhu == 0) {
            kategoriSuhu = "Beku";
        } else if (Suhu > 0 && Suhu < 30) {
            kategoriSuhu = "Dingin";
        } else if (Suhu >= 30 && Suhu < 40) {
            kategoriSuhu = "Hangat";
        } else if (Suhu >= 40 && Suhu < 70) {
            kategoriSuhu = "Panas";
        } else if (Suhu >= 70 && Suhu < 100) {
            kategoriSuhu = "Hampir Mendidih";
        } else if (Suhu >= 100 && Suhu < 120) {
            kategoriSuhu = "Mendidih";
        } else if (Suhu >= 120) {
            kategoriSuhu = "Gosong";

        }
        System.out.println("Suhunya adalah: " + kategoriSuhu);
    }
}

