import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class SimpanNegara {
    public static void main(String[] args) {
        try {
            // Buka file untuk penulisan data
    	    FileOutputStream berkasData = 
    		new FileOutputStream("negara.dat");
    	
    	    // Buat objek untuk penulisan data
            DataOutputStream keluaran = 
                new DataOutputStream(berkasData);
            
    	    // Simpan data pertama
    	    keluaran.writeUTF("Austria");
    	    keluaran.writeUTF("Vienna");
    	    
    	    // Simpan data kedua
    	    keluaran.writeUTF("Belanda");
            keluaran.writeUTF("Amsterdam");
    	    
    	    // Simpan data ketiga
    	    keluaran.writeUTF("Indonesia");
            keluaran.writeUTF("Jakarta");
    	    
    	    // Tutup file
    	    berkasData.close();
    	    
    	    System.out.println("Data sudah disimpan");
    	}
    	catch(Exception e) {
    		System.out.println("Terjadi kesalahan: " +
    	                       e.getMessage());
    	}
    }
}

