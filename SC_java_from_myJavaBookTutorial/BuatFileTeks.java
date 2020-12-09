import java.io.FileWriter;
import java.io.PrintWriter;

public class BuatFileTeks {
    public static void main(String[] args) {

        try {
            // Objek file
       	    FileWriter berkas = 
       	        new FileWriter("burung.txt");
        	
            // Objek untuk penulisan data ke file
            PrintWriter keluaran = new PrintWriter(berkas);
        	
            // Simpan 4 burung
            keluaran.println("Beo");
            keluaran.println("Cenderawasih");
            keluaran.println("Cucak rowo");
            keluaran.println("Kutilang");
        	
        // Tutup file
        berkas.close();
        	
        System.out.println("Data telah disimpan di burung.txt");
        }
        catch (Exception e) {
        	System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}

