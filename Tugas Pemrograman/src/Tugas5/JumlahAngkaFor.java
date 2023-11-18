package Tugas5;

import java.util.Scanner;

public class JumlahAngkaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang ingin Anda jumlahkan? ");
        int jumlahAngka = scanner.nextInt();

        int total = 0;
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            int angka = scanner.nextInt();
            total += angka;
        }

        System.out.println("Total dari " + jumlahAngka + " angka adalah: " + total);

        scanner.close();
    }
}
