import java.io.FileReader;
import java.io.BufferedReader;

public class BacaFileTeks {
    public static void main(String[] args) {
        String namaFile = "BacaFileTeks.java";

        try {
            FileReader berkas = new FileReader(namaFile);
            BufferedReader masukan = new BufferedReader(berkas);
        	
            // Baca data
            while (true) {
                String data = masukan.readLine();
                
                if (data == null)
                	break;
                
                System.out.println(data);
            }
        
            // Tutup file
            berkas.close();
        }
        catch(Exception e) {
            System.out.println("Kesalahan: " + e.getMessage());
        }
    }
}

