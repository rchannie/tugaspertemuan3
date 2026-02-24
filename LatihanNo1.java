/*
Latihan No.1
Muhammad Raditya Santosa_2409461
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah karakter,
periksa apakah karakter memiliki urutan konsonan-vokal-konsonan (masukan adalah
sebuah huruf dan merupakan huruf kecil)
*/

import java.util.Scanner;

public class LatihanNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Pemeriksaan Urutan Karakter=====");
        System.out.print("Masukkan karakter pertama: ");
        char char1 = scanner.next().charAt(0);
        System.out.print("Masukkan karakter kedua: ");
        char char2 = scanner.next().charAt(0);
        System.out.print("Masukkan karakter ketiga: ");
        char char3 = scanner.next().charAt(0);

        boolean isKonsonanVokalKonsonan = isKonsonan(char1) && isVokal(char2) && isKonsonan(char3);

        if (isKonsonanVokalKonsonan) {
            System.out.println("\nKarakter memiliki urutan konsonan-vokal-konsonan.");
        } else {
            System.out.println("\nKarakter tidak memiliki urutan konsonan-vokal-konsonan.");
        }
    }

    private static boolean isVokal(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private static boolean isKonsonan(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }
}