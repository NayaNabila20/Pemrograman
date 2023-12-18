package Tugas3;

import java.util.Scanner;

public class Flowchart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        System.out.print("Minimum: ");
        int minVal = scanner.nextInt();

        System.out.print("Maximum = ");
        int maxVal = scanner.nextInt();

        System.out.print("Interval = ");
        int interval = scanner.nextInt();

        if (maxVal - minVal< interval) {
            System.out.println("Invalid interval");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += minVal;
                minVal += interval;
            }
            System.out.println("Sum = " + sum);
        }
    }
}