import java.util.Scanner;

public class nilaiTerbesar  {
    public static void main(String[] args) {

        System.out.println("Nilai terbesar ");
        Scanner nil = new Scanner(System.in);
        int a1, a2, a3;

        System.out.println("Nilai a1: ");
        a1 = nil.nextInt();
        System.out.print("Nilai a2: ");
        a2 = nil.nextInt();
        System.out.print("Nilai a3: ");
        a3 = nil.nextInt();

        if (a1 > a2 && a1 > a3)
        System.out.print("Nilai terbesar adalah: " + a1);
        else if (a2 > a3)
        System.out.print("Nilai terbesar adalah: " + a2);
        else
        System.out.print("Nilai terbesar adalah: " + a3);
    }
}