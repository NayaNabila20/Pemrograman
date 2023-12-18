package Sololearn;

import java.util.Scanner;

public class CelsiustoFahrenheit4c {

    // Define the fahr() method to convert Celcius to Fahrenheit
    static double fahr(double celcius) {
        double fahrenheit = 1.8 * celcius + 32;
        return fahrenheit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c)); // Call the fahr() method and print the result
    }
}