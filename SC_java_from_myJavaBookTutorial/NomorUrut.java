import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class NomorUrut {
    public static void main(String[] args) {
        String namaFile = "NomorUrut.java";
        int nomor = 0;
        
        try {
            FileReader berkasMasukan = new FileReader(namaFile);
            BufferedReader masukan = new BufferedReader(berkasMasukan);

            FileWriter berkasKeluaran = 
       	        new FileWriter("hasil.txt");
            PrintWriter keluaran = new PrintWriter(berkasKeluaran);
        	
            // Baca data
            while (true) {
                String data = masukan.readLine();
                
                if (data == null)
                	break;
                
                // Rekam ke file output
                nomor++;
                keluaran.println(nomor + ": " + data);
            }
        
            // Tutup file
            berkasMasukan.close();
            berkasKeluaran.close();
        }
        catch(Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
            System.exit(1); // Akhiri program
        }

        System.out.println("Hasil dapat dilihat di file hasil.txt");
    }
}

