import java.util.Scanner;

public class TanpaDef {
    public static void main(String[] args) {
        System.out.print("Kode hari (0..6): ");
        Scanner kbd = new Scanner(System.in);
        int kodeHari = kbd.nextInt();
        kbd.close();

        String keterangan = "";

        switch (kodeHari) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                keterangan = "Hari kerja";
                break;
            case 0:
            case 6:
                keterangan = "Hari libur";
                break;               
        }

        if (keterangan.isEmpty()) 
             System.out.println("Kode hari salah");
        else 
             System.out.println(keterangan);
    }
}
