package Tugas3;

import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double jumlah = angka1 + angka2;

        System.out.println("Hasil penjumlahan: "+jumlah);

        input.close();
    }
}