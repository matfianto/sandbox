import java.util.Scanner;

public class Nkesatu  {
    public static void main(String[] args) {
        System.out.print("Bilangan bulat n = ");
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        kbd.close();

        int i = n;
        while (i > 0) {
            System.out.println(i);

            i--;
        }
    }
}
