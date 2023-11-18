package tugas1;

public class TotaldanRatarata {
    public static void main(String[] abc){
        int a = 25;
        int b = 30;
        int c = 45;
        int total = a+b+c;
        double ratarata = (double) (a+b+c) / 3;

        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("Total = "+total);
        System.out.println("Ratarata = "+ratarata);
    }
}
