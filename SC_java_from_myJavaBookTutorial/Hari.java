import java.util.Scanner;

public class Hari  {
    public static void main(String[] args) {
        System.out.print("Kode hari (0..6): ");
        Scanner kbd = new Scanner(System.in);
        int kodeHari = kbd.nextInt();
        kbd.close();

        String namaHari = "Kode hari salah!";
        if (kodeHari == 0)
            namaHari = "Minggu";
        else
            if (kodeHari == 1)
                namaHari = "Senin";
            else
                if (kodeHari == 2)
                    namaHari = "Selasa";
                else
                    if (kodeHari == 3)
                        namaHari = "Rabu";
                    else
                        if (kodeHari == 4)
                            namaHari = "Kamis";
                        else
                            if (kodeHari == 5)
                                namaHari = "Jumat";
                            else
                                if (kodeHari == 6)
                                    namaHari = "Sabtu";

        System.out.println("Kode hari : " + kodeHari);
        System.out.println("Nama hari : " + namaHari);
    }
}
