import java.io.RandomAccessFile;

public class UbahKeKapital {
    public static void main(String[] args) {
        try {
            // Buka file
            RandomAccessFile berkas = 
                new RandomAccessFile("burung.txt","rw");            

            // Tampilkan isi berkas
            berkas.seek(0);  // ke awal berkas
            long posisi;
            while (berkas.getFilePointer() < berkas.length()) {
                // Baca sebuah karakter
                char kar = (char) berkas.readByte();

                // Simpan posisi penunjuk file 
                posisi = berkas.getFilePointer();
                
                // Ubah huruf kecil ke kapital
                char hasilKonversi;
                if (kar >= 'a' && kar <= 'z')
                    hasilKonversi = (char)(kar - 32);
                else
                    hasilKonversi = kar;
                
                // Letakkan penunjuk file ke posisi karakter
                //     yang akan diganti
                berkas.seek(posisi - 1);

                // Tuliskan karakter pengganti
                berkas.writeByte(hasilKonversi);
            }
            
            // Tutup file
            berkas.close();

            System.out.println("Data suah diganti. Cek di file burung.txt");
        }
        catch(Exception e) {
            System.out.println("Terjadi kesalahan pada file");
            System.exit(1); // Akhiri program
        }
    }

}
