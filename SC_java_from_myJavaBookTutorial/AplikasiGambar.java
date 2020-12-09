import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class AplikasiGambar extends JFrame {
    public AplikasiGambar() {
        super("Aplikasi Penampil Gambar");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Baca file gambar
        BufferedImage gambar = null;
        try {
            gambar = ImageIO.read(
                new File("D:\\latjava\\media\\tokyo.png"));
        }
        catch (Exception ex)
        {
            System.exit(1); 	
        }
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelGambar = new JLabel(new ImageIcon(gambar));
  
        panel.add(labelGambar);
        add(panel);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiGambar app = new AplikasiGambar(); 
    }
}

