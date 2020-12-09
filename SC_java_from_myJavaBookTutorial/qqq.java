import java.util.*;
public class qqq {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("\n10. Penggunaan while\nkalimat / kata yang ingin diulang = ");
        String kat = kbd.nextLine();
        System.out.println("jumlah banyak pengulangan = ");
        int t = kbd.nextInt();
        int s = 1;
        while (s <= t) {
            System.out.println(s+"."+" "+kat);
            s++;
        }
    }
}