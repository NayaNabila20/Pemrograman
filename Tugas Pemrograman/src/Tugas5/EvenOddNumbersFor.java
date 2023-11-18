package Tugas5;

import java.util.Scanner;

public class EvenOddNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang ingin Anda input? ");
        int jumlahAngka = scanner.nextInt();
        int totalGenap = 0;
        int totalGanjil = 0;

        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = scanner.nextInt();

            if (angka % 2 == 0) {
                totalGenap += angka;
            } else {
                totalGanjil += angka;
            }
        }

        System.out.println("Total angka genap: " + totalGenap);
        System.out.println("Total angka ganjil: " + totalGanjil);

        scanner.close();
    }
}
