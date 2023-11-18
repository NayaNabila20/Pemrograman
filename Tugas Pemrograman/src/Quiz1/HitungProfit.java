package Quiz1;

import java.util.Scanner;

public class HitungProfit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai modal: ");
        int modal = input.nextInt();
        System.out.print("Masukkan persen keuntungan: ");
        int persenKeuntungan = input.nextInt();

        int profit = modal + (modal * (persenKeuntungan / 100));

        System.out.println("nilai modal = "+modal);
        System.out.println("persen keuntungan = "+persenKeuntungan+ "%");
        System.out.println("profit: "+ profit);

        input.close();

    }
}