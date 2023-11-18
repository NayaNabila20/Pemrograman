package Tugas3;

import java.util.Scanner;

public class PemesananMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di program pemesanan makanan!");

        System.out.print("Masukkan nama makanan yang ingin dipesan: ");
        String namaMakanan = input.next();

        System.out.print("Masukkan harga per makanan: ");
        double hargaMakanan = input.nextDouble();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();

        double subtotal = hargaMakanan * jumlahPesanan;

        System.out.println("Pesanan berhasil ditambahkan.");
        System.out.println("Total Harga Pesanan: Rp " + subtotal);
        System.out.println("Terima kasih atas pesanannya!");

        input.close();
    }
}