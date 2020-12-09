import java.util.Scanner;

public class ContohSwitch {
    public static void main(String[] args) {
        System.out.print("Kode hari (0..6): ");
        Scanner kbd = new Scanner(System.in);
        int kodeHari = kbd.nextInt();
        kbd.close();

        String namaHari;
        switch (kodeHari) {
            case 0:
                namaHari = "Minggu";
                break;
            case 1:
                namaHari = "Senin";
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Kode hari salah!";                
        }

        System.out.println("Kode hari : " + kodeHari);
        System.out.println("Nama hari : " + namaHari);
    }
}
