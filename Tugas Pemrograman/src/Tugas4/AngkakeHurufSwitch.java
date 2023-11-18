package Tugas4;

import java.util.Scanner;

public class AngkakeHurufSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        double nilai = scanner.nextDouble();
        scanner.close();

        char nilaiHuruf;

        if (nilai >= 0 && nilai <= 100) {
            int nilaiBulat = (int) nilai; // Mengonversi nilai angka ke bilangan bulat
            switch (nilaiBulat / 10) {
                case 9:
                case 8:
                    nilaiHuruf = 'A';
                    break;
                case 7:
                    nilaiHuruf = 'B';
                    break;
                case 6:
                    nilaiHuruf = 'C';
                    break;
                case 5:
                    nilaiHuruf = 'D';
                    break;
                default:
                    nilaiHuruf = 'E';
            }
            System.out.println("Nilai huruf: " + nilaiHuruf);
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
