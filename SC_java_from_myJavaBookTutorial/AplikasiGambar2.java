import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class AplikasiGambar2 extends JFrame {
    public AplikasiGambar2() {
        super("Aplikasi Penampil Gambar");
        setSize(300, 300);
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
        JLabel labelGambar = new JLabel(new ImageIcon(gambar));
        
        JScrollPane panel = new JScrollPane(labelGambar,
        	JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
        	JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        //panel.add(labelGambar);
        add(panel);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiGambar2 app = new AplikasiGambar2(); 
    }
}

