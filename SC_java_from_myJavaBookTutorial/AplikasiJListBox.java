import javax.swing.*;
import java.awt.event.*;

public class AplikasiJComboBox extends JFrame {
    JComboBox komboWarna = new JComboBox();
    String[] warna = { "Biru", "Kuning", "Merah", "Hijau",
	 	       "Ungu", "Jingga", "Putih", "Hitam",
                       "Lainnya" };
	
    public AplikasiJComboBox() {
        super("Aplikasi JComboBox");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelJudul = new JLabel("Warna paling disukai: ");
        panel.add(labelJudul);
        panel.add(komboWarna);
        add(panel);
        
        // Isikan ke kotak kombo
        for (int i = 0; i < warna.length; i++) {
        	komboWarna.addItem(warna[i]);
        }
          
        komboWarna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Dijalankan kalau ada pemilihan di kotak kombo
                JOptionPane.showMessageDialog(null, 
            		     "Pilihan Anda: " +
            	             komboWarna.getItemAt(
            	             komboWarna.getSelectedIndex()));                
            }
        });
       
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  AplikasiJComboBox app = new AplikasiJComboBox(); 
    }
}

