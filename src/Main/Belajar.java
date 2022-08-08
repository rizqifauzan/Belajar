//package Main;
//import java.util.Scanner;
//
//public class Belajar {
//    public static void main(String[] args) {
//
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Posisi Baris Kuda : ");
//            int barisKuda = scanner.nextInt();
//            System.out.print("Posisi Kolom Kuda : ");
//            int kolomKuda = scanner.nextInt();
//
//            System.out.println();
//            System.out.println();
//            char[][] posisiBidak = new char[8][8];
//            posisiBidak[barisKuda][kolomKuda] = 'K';
//            String[] posisiBidak = {"0","1","2","3","4","5","6","7"};
//
//
//            for(int i=0; i<posisiBidak.length; i++) {
//                for(int j=0; j<posisiBidak[i].length; j++) {
//                    switch (posisiBidak[i][j]) {
//                        case 'K':
//                            System.out.print("K|");
//                            break;
//                        case 'X':
//                            System.out.print("X|");
//                            break;
//                        default:
//                            System.out.print("-|");
//                            break;
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//
