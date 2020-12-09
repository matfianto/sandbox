import java.util.Scanner;

public class campuran {
    public static void main(String[] args) {
        System.out.println("program campuran");
        Scanner kbd = new Scanner(System.in);

        // 1. olah String
        String k1, k2;
        System.out.println("\n1. olah string\nmskkan kalimat 1 : ");
        k1 = kbd.nextLine();
        System.out.println("mskkan kalimat 2 : ");
        k2 = kbd.nextLine();
        System.out.println("apakah kedua kalimat tersebut identik ?");
        System.out.println(k1.equalsIgnoreCase(k2));
        System.out.println("ambilan substing kalimat 2 (1,6) adalah : ");
        System.out.println(k2.substring(0,6));
        System.out.println("kalimat 1 menjadi huruf kapital : ");
        System.out.println(k1.toUpperCase());
        System.out.println("byknya karakter kalimat 2 adalah : ");
        System.out.println(k2.length());

        // 2. olah bil
        int bil1, bil2, bil3, bil4;
        double total1, totalsm;
        System.out.println("\n2. olah bil, (bil1+bil2*bil3)/bil4\nmskkan bil 1 = ");
        bil1 = kbd.nextInt();
        System.out.println("mskkan bil 2 = ");
        bil2 = kbd.nextInt();
        System.out.println("mskkan bil 3 = ");
        bil3 = kbd.nextInt();
        System.out.println("mskkan bil 4 = ");
        bil4 = kbd.nextInt();
        total1 = (double)bil1 + (double)bil2 * (double)bil3;
        totalsm = total1 / (double)bil4;
        System.out.println("hasil (bil 1 + bil 2 * bil 3) / bil 4 adalah = "+total1+" / "+(double)bil4+" = "+totalsm);

        // 3. kondisional 1, kondisional if sederhana
        System.out.println("\n3. kondisional if sederhana\nmasukkan nilai (0..100), jika >= 60 anda lulus");
        int nilai = kbd.nextInt();
        String hasil = "gagal";
        if (nilai >= 60)
            hasil = "lulus";
        System.out.println("status anda = "+ hasil);

        // 4. kondisional 2, if else if else
        int nilai2;
        System.out.println("\n4. kondisional if else if else\nnilai (0..100)");
        nilai2 = kbd.nextInt();
        if (nilai2 == 100) {
            System.out.println("nilai anda "+nilai2);
            System.out.println("sangat memuaskan");
        } else if (nilai2 >= 80) {
            System.out.println("nilai anda "+nilai2);
            System.out.println("baik");
        } else if (nilai2 >= 60) {
            System.out.println("nilai anda "+nilai2);
            System.out.println("cukup");
        } else if (nilai2 >= 40) {
            System.out.println("nilai anda "+nilai2);
            System.out.println("kurang");
        } else {
            System.out.println("nilai anda "+nilai2);
            System.out.println("pengulangan");
        }

        // 5. kondisional 3, kondisional if else if bersarang
        int kodeHari;
        String namaHari = "kode hari salah";
        System.out.println("\n5. kondisional if else if bersarang\npencarian nama hari berdasarkan kode (0..7)");
        System.out.print("masukkan kode = ");
        kodeHari = kbd.nextInt();
        if (kodeHari == 1) {
            namaHari = "senin";
        } else if (kodeHari == 2) {
            namaHari = "selasa";
        } else if (kodeHari == 3) {
            namaHari = "rabu";
        } else if (kodeHari == 4) {
            namaHari = "kamis";
        } else if (kodeHari == 5) {
            namaHari = "jumat";
        } else if (kodeHari == 6) {
            namaHari = "sabtu";
        } else if (kodeHari == 7) {
            namaHari = "minggu";
        }
        System.out.println("kode hari = "+kodeHari);
        System.out.println("nama hari = "+namaHari);

        // 6. kondisional if else if else bersarang (nested conditional logic) 1
        int cuti, jumlahSksLulus;
        System.out.println("\n6. kondisional if else if else bersarang (nested conditional logic)\nmengetahui sebuah mahasiswa akan DO, di semester terakhir");
        System.out.println("dimana status DO akan didapatkan jika :");
        System.out.println("1. Mahasiswa tersebut kurang dari 144 sks dan tidak pernah cuti");
        System.out.println("2. Jika pernah cuti, cek apakah mahasiswa tersebut melebihi 120 sks, jika kurang maka tetap DO");
        System.out.println("3. Kemungkinan lain dari kedua hal tersebut, maka mahasiswa tidak DO");
        System.out.println("\nberapa sks yang sudah terlaksana ? ");
        jumlahSksLulus = kbd.nextInt();
        System.out.println("apakah pernah cuti? ketik 1 untuk ya, ketik 2 untuk tidak. (1/2) ? ");
        cuti = kbd.nextInt();
        if (cuti == 1) {
            if (jumlahSksLulus < 120) {
                System.out.println("Kamu DO!");
            } else {
                System.out.println("Kamu Tidak Jadi DO!");
            }
        } else if (cuti == 2) {
            if (jumlahSksLulus < 144) {
                System.out.println("Kamu DO!");
            } else {
                System.out.println("Kamu Tidak Jadi DO!");
            }
        } else {
            System.out.println("masukkan salah, yang anda masukkan = " + cuti);
            System.out.println("masukkan hanya menerima 1 atau 2");
        }

        // 7. kondisional if else if else bersarang (nested conditional logic) 2
        System.out.println("\n7. kondisional if else if else bersarang (nested conditional logic) 2\nmencari nilai terbesar dari 4 masukkan");
        int a1, a2, a3, a4;
        System.out.println("mskan nilai a1 : ");
        a1 = kbd.nextInt();
        System.out.println("mskan nilai a2 : ");
        a2 = kbd.nextInt();
        System.out.println("mskan nilai a3 : ");
        a3 = kbd.nextInt();
        System.out.println("mskan nilai a4 : ");
        a4 = kbd.nextInt();
        if (a1 > a2 && a1 > a3) {
            if (a1 > a4) {
                System.out.println("nilai terbesar : "+a1);
            } else if (a2 > a3 && a2 > a4) {
                System.out.println("nilai terbesar : "+a2);
            } else if (a3 > a4) {
                System.out.println("nilai terbesar : "+a3);               
            } else {
                System.out.println("nilai terbesar : "+a4);
            }
        }
        else if (a2 > a3 && a2 > a4) {
            System.out.println("nilai terbesar : "+a2);
        }
        else if (a3 > a4) {
            System.out.println("nilai terbesar : "+a3);               
        } else {
            System.out.println("nilai terbesar : "+a4);
        }

        // 8. pengunaan switch case
        int kodeHari2;
        String namaHari2;
        System.out.println("\n8. pengunaan switch case\npencarian nama hari berdasarkan kode (0..7)");
        System.out.print("masukkan kode = ");
        kodeHari2 = kbd.nextInt();
        switch (kodeHari2) {
            case 1:
                namaHari2 = "senin";
                break;
            case 2:
                namaHari2 = "selasa";
                break;
            case 3:
                namaHari2 = "rabu";
                break;
            case 4:
                namaHari2 = "kamis";
                break;
            case 5:
                namaHari2 = "jumat";
                break;
            case 6:
                namaHari2 = "sabtu";
                break;
            case 7:
                namaHari2 = "minggu";
                break;
            default:
                namaHari2 = "kode hari salah";
            }
            System.out.println("kode hari = " + kodeHari2);
            System.out.println("nama hari = " + namaHari2);

        // 9. penggunaan switch case beserta if else
        int kodeHari3;
        String namaHari3 = "";
        System.out.println("\n9. penggunaan switch case beserta if else\npencarian hari kerja dan hari libur berdasarkan kode (0..7)");
        System.out.print("masukkan kode = ");
        kodeHari3 = kbd.nextInt();
        switch (kodeHari3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            namaHari3 = "hari kerja";
            break;
            case 6:
            case 7:
            namaHari3 = "hari libur";
        }
        if (namaHari.isEmpty()) {
            System.out.println("kode yang dimasukkan = "+kodeHari3);
            System.out.println("kode hari salah");
        } else {
            System.out.println("kode yang dimasukkan = "+kodeHari3);
            System.out.println("hari tersebut adalah = "+namaHari3);
        }
        // 10. penggunaan while
        String kat;
        System.out.println("\n10. Penggunaan while\nkalimat / kata yang ingin diulang = ");
        kat = kbd.nextLine();
        System.out.println("jumlah banyak pengulangan = ");
        int t = kbd.nextInt();
        int s = 1;
        while (s <= t) {
            System.out.println(s+"."+" "+kat);
            s++;
        }

        // 11. penggunaan do .. while
        int bilangan = 0;
        boolean ok;
        do {
            ok = true;
            System.out.print("\nPengunaan Do .. While\nmasukkan sebuah bilangan bulat = ");
            try {
                bilangan = kbd.nextInt();
            }
            catch (Exception e) {
                System.out.println("masukan data bilangan salah!");
                ok = false;
                kbd.nextLine(); // Buang data tersisa
            }
        } while (!ok);
        System.out.println("Oke. Anda benar memasukkan bilangan " +bilangan);

        //12. penggunaan for
        System.out.print("\n12. Pengunaan For\nmasukkan sebuah bilangan bulat = ");
        int p = kbd.nextInt();
        for (int a = 1; a <= p; a++) {
            System.out.println(a);
        }

        //13. array 1 dim
        System.out.println("\n13. Array 1 dimensi");
        int hasila[] = new int[5]; // deklarasi array dengan 5 elemen
        // isi setiap elemen array
        hasila[0] = 70;
        hasila[1] = 80;
        hasila[2] = 75;
        hasila[3] = 90;
        hasila[4] = 65;
        // tampilkan isi array
        for (int k = 0; k < 5; k++)
            System.out.println(hasila[k]);
        // tampilkan perolehan jumlah array
        System.out.println("Jumlah total array = "+hasila.length);

        //14. array 2 dim
        System.out.print("\n13. Array 2 dimensi");
        int matriks2dim[][] =  {
            {1, 2, 3},
            {4, 5, 6}
        };
        // Tampilkan isi elemen array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matriks2dim[i][j] + " ");

            System.out.println(); // Pindah baris
        }

    kbd.close();
    }
}