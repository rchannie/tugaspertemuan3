/*
Latihan No.2
Muhammad Raditya Santosa_2409461
Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana
jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama
maka tampilkan bukan kubus.
*/

import java.util.Scanner;

public class LatihanNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Pemeriksaan Sisi Kubus=====");
        System.out.print("Masukkan panjang sisi pertama: ");
        int sisi1 = scanner.nextInt();
        System.out.print("Masukkan panjang sisi kedua: ");
        int sisi2 = scanner.nextInt();
        System.out.print("Masukkan panjang sisi ketiga: ");
        int sisi3 = scanner.nextInt();

        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("\nTermasuk Kubus.");
        } else {
            System.out.println("\nBukan kubus.");
        }
    }
}