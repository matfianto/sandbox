import javax.swing.*;

public class AplikasiToolbar extends JFrame {	
    public AplikasiToolbar() {
        super("Aplikasi dengan JToolBar");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Bentuk ikon
        ImageIcon ikonBaru = new ImageIcon(
        		"D:\\latjava\\media\\folder_new.png");
        ImageIcon ikonSimpan = new ImageIcon(
        		"D:\\latjava\\media\\save.png");
        ImageIcon ikonCetak = new ImageIcon(
        		"D:\\latjava\\media\\printer_picture.png");
        
        // Buat tombol dengan ikon
        JButton tombolBaru = new JButton("Baru", ikonBaru);
        JButton tombolSimpan = new JButton("Simpan", ikonSimpan);
        JButton tombolCetak = new JButton("Cetak", ikonCetak);
        
        // Buat toolbar dan tambahkan tombol ke toolbar
        JToolBar toolbar = new JToolBar();
        toolbar.add(tombolBaru);
        toolbar.add(tombolSimpan);
        toolbar.add(tombolCetak);
        
        // Buat panel
        JPanel panel = new JPanel();
        
        // Tambahkan toolbar dan panel ke frame
        add(toolbar, "North");
        add(panel, "South");
                
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiToolbar app = new AplikasiToolbar();
    }
}

