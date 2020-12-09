import javax.swing.*;
import java.awt.event.*;

public class AplikasiYaTidak extends JFrame
                         implements ActionListener {
    String[] daftarPilihan = { "Ya", "Tidak", "Ragu-ragu" };
	
    public AplikasiYaTidak() {
        super("Kotak Dialog Ya/Tidak");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JButton tombol = new JButton("Tampilkan");
        
        panel.add(tombol);
        add(panel);
        
        tombol.addActionListener(this);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Dieksekusi kalau tombol diklik
    	  int jawaban = JOptionPane.showOptionDialog(null, 
    			"Mana yang akan Anda pilih?",
    			"Pilihan",
    			JOptionPane.YES_NO_OPTION,
    			JOptionPane.QUESTION_MESSAGE,
    			null,
    			daftarPilihan,
    			daftarPilihan[1]);
    
    	  // Tanggapi jawaban
   	  JOptionPane.showMessageDialog(null, 
        			"Anda memilih: " + 
   		            daftarPilihan[jawaban]);
    }	

    public static void main(String[] args) {
    	  AplikasiYaTidak app = new  AplikasiYaTidak(); 
    }
}

