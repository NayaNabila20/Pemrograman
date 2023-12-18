package Tugas5;

import java.util.Scanner;

public class JumlahAngkaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang ingin Anda jumlahkan? ");
        int jumlahAngka = scanner.nextInt();

        int total = 0;
        int i = 0;

        while (i < jumlahAngka) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int angka = scanner.nextInt();
            total += angka;
            i++;
        }

        System.out.println("Total dari " + jumlahAngka + " angka adalah: " + total);

        scanner.close();
    }
}