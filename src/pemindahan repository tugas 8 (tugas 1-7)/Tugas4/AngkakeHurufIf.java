package Tugas4;

import java.util.Scanner;

public class AngkakeHurufIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilai = scanner.nextDouble();
        scanner.close();

        char nilaiHuruf;

        if (nilai >= 80 && nilai <= 100) {
            nilaiHuruf = 'A';
        } else if (nilai >= 70 && nilai < 79.99) {
            nilaiHuruf = 'B';
        } else if (nilai >= 60 && nilai < 69.99) {
            nilaiHuruf = 'C';
        } else if (nilai >= 50 && nilai < 59.99) {
            nilaiHuruf = 'D';
        } else if (nilai >= 0 && nilai < 49.99) {
            nilaiHuruf = 'E';
        } else {
            nilaiHuruf = 'T';
        }

        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}