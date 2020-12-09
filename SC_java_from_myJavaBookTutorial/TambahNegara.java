import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class TambahNegara {
    public static void main(String[] args) {
        try {
            // Buka file untuk penulisan data
    	    FileOutputStream berkasData = 
    		new FileOutputStream("negara.dat", true);
    	
    	    // Buat objek untuk penulisan data
            DataOutputStream keluaran = 
                new DataOutputStream(berkasData);
            
    	    // Simpan data pertama
    	    keluaran.writeUTF("Jerman");
    	    keluaran.writeUTF("Berlin");
    	    
    	    // Simpan data kedua
    	    keluaran.writeUTF("Malaysia");
            keluaran.writeUTF("Kuala Lumpur");
    	    
    	    // Tutup file
    	    berkasData.close();
    	    
    	    System.out.println("Data sudah ditambahkan");
    	}
    	catch(Exception e) {
    		System.out.println("Terjadi kesalahan: " +
    	                       e.getMessage());
    	}
    }
}

