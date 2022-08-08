package Main;

import java.util.HashMap;

public class empatjuni {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i += 2) {
//            System.out.println("Nomor urut ke: " + i);
//
//            for (int j = 11; j >= 0; j -= 2) {
//                System.out.println("Nomor urut ke: " + j);
//            }
        //user input max 4 buku (menambah buku max 4)
//        int j = 0;
//        while (j > 10) {
//            System.out.println("Nomor urut ke: " + j);
//            if (j % 2 == 0) {
//                j++;
//            }
//        }
//        do {
//            System.out.println("Masuk");
//        } while (j < 10);

        //
//        for (int i=11; i>10; i+=2) {
//            System.out.println("Nomor urut ke: " + i);
//            while ((i%2!=0)) {
////                for (int j=0; j<i; j++);
////            }
//        String huruf = "asdfghjkl";
//        huruf.length();
//        huruf.charAt(0);
//        for (int i = huruf.length() - 1; i >= 0; i--) {
//            System.out.print(huruf.charAt(i));
//
//        }
//
//    }
////}
//// membuat objek hashmap
//        HashMap<Integer, String> days = new HashMap<Integer, String>();
//// mengisi nilai ke objek days
//        days.put(1, "Minggu");
//        days.put(2, "Senin");
//        days.put(3, "Selasa");
//        days.put(4, "Rabu");
//        days.put(5, "Kamis");
//        days.put(6, "Jum'at");
//        days.put(7, "Sabtu");
//// mencetak semua isi dari objek days
//        System.out.println("Isi objek days: " + days);

//        for(int i=0; i<4; i++) {
//            for (int k=2; k>=i; k--) {
//                System.out.print(" ");
//            }
//            for (int j=0; j<i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//    }

        for (int i = 0; i <= 10; i++) { //perulangan dari 0 -10

            if (i % 2 == 0) // Percabangan apakah i div 2 = 0,Maka akan mencetak nilai yang True

                System.out.println(i + " : Genap");
            else {
                System.out.println(i + " : Ganjil");
            }

        }
    }
    }