/*
Latihan No.3
Muhammad Raditya Santosa_2409461
Menentukan lama bekerja seseorang berdasarkan jam masuk dan jam keluar dengan
asumsi jam hanya 1 sampai dengan 12 dan lama bekerja seorang pegawai kurang dari
12 jam.
*/

import java.util.Scanner;

public class LatihanNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Perhitungan Lama Bekerja=====");
        System.out.print("Masukkan jam masuk (1-12): ");
        int jamMasuk = scanner.nextInt();
        System.out.print("Masukkan jam keluar (1-12): ");
        int jamKeluar = scanner.nextInt();

        if (jamMasuk < 1 || jamMasuk > 12 || jamKeluar < 1 || jamKeluar > 12) {
            System.out.println("\nInput jam harus antara 1 dan 12.");
            return;
        }

        int lamaBekerja;
        if (jamKeluar >= jamMasuk) {
            lamaBekerja = jamKeluar - jamMasuk;
        } else {
            lamaBekerja = (12 - jamMasuk) + jamKeluar;
        }

        System.out.println("\nLama bekerja " + lamaBekerja + " jam.");
    }
}
