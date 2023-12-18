package Sololearn;

import java.util.Scanner;

public class Bot4a {

    public static void bot() {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if (userInput == 1) {
            System.out.println("Order confirmed");
        } else if (userInput == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }

        sc.close();

    }

    public static void main(String[] args) {
        bot();
    }
}