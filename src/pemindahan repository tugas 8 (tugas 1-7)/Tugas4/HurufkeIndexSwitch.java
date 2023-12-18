package Tugas4;

import java.util.Scanner;

public class HurufkeIndexSwitch {
    public static void main(String[] args) {
        // Membaca nilai huruf dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        char nilaiHuruf = scanner.next().charAt(0);
        scanner.close();

        double nilaiKonversi = 0.0;

        // Mengkonversi nilai huruf ke nilai indeks
        switch (nilaiHuruf) {
            case 'A':
                nilaiKonversi = 4.0;
                break;
            case 'B':
                nilaiKonversi = 3.0;
                break;
            case 'C':
                nilaiKonversi = 2.0;
                break;
            case 'D':
                nilaiKonversi = 1.0;
                break;
            case 'E':
                nilaiKonversi = 0.0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                System.exit(1); // Keluar dari program jika nilai tidak valid
        }

        // Menampilkan hasil konversi
        System.out.println("Nilai konversi: " + nilaiKonversi);
    }
}