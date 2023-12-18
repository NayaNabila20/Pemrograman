package Sololearn;

import  java.util.Scanner;

public class BoxesSwitch2c {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();

        int boxNumber;

        switch (color){
            case "red":
                boxNumber = 1;
                break;
            case "green":
                boxNumber = 2;
                break;
            case "black":
                boxNumber = 3;
                break;
            default:
                boxNumber = -1; // Handle unknown colors
                break;
        }

        if (boxNumber != -1) {
            System.out.println(boxNumber);
        } else {
            System.out.println("unknown color");
        }
    }
}