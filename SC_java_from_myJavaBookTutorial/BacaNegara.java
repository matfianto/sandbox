import java.io.FileInputStream;
import java.io.DataInputStream;

public class BacaNegara {
    public static void main(String[] args) {
        try {
    	    FileInputStream berkasData = 
    	        new FileInputStream("negara.dat");
    		
    	    DataInputStream masukan = 
    	        new DataInputStream(berkasData);
    		
    	    while (masukan.available() > 0) {
                System.out.print("Negara " + masukan.readUTF());
                System.out.println(" beribukota di " + 
                                   masukan.readUTF());
            }
    		
    	    berkasData.close();
    	}
    	catch(Exception e) {
    	    System.out.println("Kesalahan: " + e.getMessage());	
    	}
    }
}

