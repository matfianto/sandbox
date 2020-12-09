import java.io.FileOutputStream;
import java.io.DataOutputStream;

import java.io.FileInputStream;
import java.io.DataInputStream;

public class AnekaTipe {
    public static void main(String[] args) {
        String namaFile = "sediaan.dat";

        // --------- Simpan data
        try {
            // Buka file untuk penulisan data
    	    FileOutputStream berkasKeluaran = 
    		new FileOutputStream(namaFile);
    	
    	    // Buat objek untuk penulisan data
            DataOutputStream keluaran = 
                new DataOutputStream(berkasKeluaran);
            
    	    // Simpan data pertama
            keluaran.writeInt(73);
    	    keluaran.writeUTF("Produk 73");
    	    keluaran.writeBoolean(true);
    	    keluaran.writeDouble(45.5);
    	    
    	    // Simpan data kedua
            keluaran.writeInt(76);
    	    keluaran.writeUTF("Produk 76");
    	    keluaran.writeBoolean(false);
    	    keluaran.writeDouble(67.25);
    	    
    	    // Simpan data ketiga
            keluaran.writeInt(189);
    	    keluaran.writeUTF("Produk 189");
    	    keluaran.writeBoolean(true);
    	    keluaran.writeDouble(100.0);
    	    
    	    // Tutup file
    	    berkasKeluaran.close();
    	    
    	    System.out.println("Data sudah disimpan");
    	}
    	catch(Exception e) {
    		System.out.println("Terjadi kesalahan: " +
    	                       e.getMessage());
    	}

        // --------- Baca data 
        try {
    	    FileInputStream berkasMasukan = 
    	        new FileInputStream(namaFile);
    		
    	    DataInputStream masukan = 
    	        new DataInputStream(berkasMasukan);
    		
            System.out.println("Isi file " + namaFile + ":");
    	    while (masukan.available() > 0) {
                int kode = masukan.readInt();
                String nama = masukan.readUTF();
                boolean stokAda = masukan.readBoolean();
                double harga = masukan.readDouble();
         
                String keteranganStok;
                if (stokAda)
                    keteranganStok = "Ada";
                else
                    keteranganStok = "Kosong";  

                System.out.printf("%-6d %-10s %8.2f  %-6s %n", 
                                  kode, nama, harga, keteranganStok);
            }
    		
    	    berkasMasukan.close();
    	}
    	catch(Exception e) {
    	    System.out.println("Kesalahan: " + e.getMessage());	
    	}
    }
}

