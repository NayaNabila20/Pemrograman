package Tugas7;

import java.util.Scanner;

public class ArrayGanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Array");

        // Input jumlah data
        System.out.print("Jumlah data: ");
        int jumlahData = scanner.nextInt();

        int[] dataArray = new int[jumlahData];

        // Input data
        System.out.println("Inputkan data berikut:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke-" + i + ": ");
            dataArray[i] = scanner.nextInt();
        }

        // Menampilkan data dan keterangan
        System.out.println("Menampilkan data");
        int total = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(dataArray[i] + " -> ");
            if (dataArray[i] % 2 == 0) {
                System.out.println("GENAP");
            } else {
                System.out.println("GANJIL");
            }
            total += dataArray[i];
        }

        // Menampilkan total penjumlahan dan rata-rata
        double rataRata = (double) total / jumlahData;
        System.out.println("TOTAL PENJUMLAHAN: " + total);
        System.out.println("RATA-RATA: " + rataRata);
    }
}

