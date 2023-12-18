package Tugas3;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        // Buat objek scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Input suhu dalam Celsius
        System.out.print("Masukkan suhu dalam Celcius = ");
        double suhuCelsius = input.nextDouble();

        // Hitung suhu dalam Fahrenheit
        double suhuFahrenheit = (suhuCelsius * 9/5) + 32;

        // Tampilkan hasil konversi dalam Fahrenheit
        System.out.print("Suhu dalam Fahrenheit = "+ suhuFahrenheit);

        // Tutup scanner
        input.close();
    }
}
