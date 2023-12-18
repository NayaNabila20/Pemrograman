package Tugas5;

import java.util.Scanner;

public class EvenOddNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Berapa banyak angka yang ingin Anda input? ");
        int jumlahAngka = scanner.nextInt();
        int i = 1;
        int totalGenap = 0;
        int totalGanjil = 0;

        while (i <= jumlahAngka) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = scanner.nextInt();

            if (angka % 2 == 0) {
                totalGenap += angka;
            } else {
                totalGanjil += angka;
            }

            i++;
        }

        System.out.println("Total angka genap: " + totalGenap);
        System.out.println("Total angka ganjil: " + totalGanjil);

        scanner.close();
    }
}