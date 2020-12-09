import javax.swing.*;

public class Komponen extends JFrame {    
    public Komponen() {
        super("Contoh Aplikasi dengan Komponen");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tambahkan komponen-komponen
        JPanel panel = new JPanel();
        JLabel labelWaktu = new JLabel("Waktu sekarang: ");
        JButton tombolProses = new JButton("Info Waktu");
        JButton tombolKeluar = new JButton("Keluar");
        
        panel.add(labelWaktu);
        panel.add(tombolProses);
        panel.add(tombolKeluar);
        add(panel);
        
        // Tampilkan jendela
        setVisible(true);
    }
    
    public static void main(String[] args) {
    	  Komponen jendela = new Komponen(); 
    }
}

