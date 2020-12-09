import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AplikasiKonfirmasi extends JFrame
                         implements ActionListener {
    public AplikasiKonfirmasi() {
        super("Aplikasi Kotak Dialog Konfirmasi");
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
    	  int jawaban = JOptionPane.showConfirmDialog(null, 
    			"Anda setuju?",
    			"Konfirmasi",
    			JOptionPane.YES_NO_OPTION);
    	
    	  // Tanggapi jawaban
    	  if (jawaban == JOptionPane.YES_OPTION)
    		JOptionPane.showMessageDialog(null, 
        			"Anda memilih Yes!");
    	  else
    		JOptionPane.showMessageDialog(null, 
        			"Anda memilih No!");
    }	

    public static void main(String[] args) {
    	  AplikasiKonfirmasi app = new  AplikasiKonfirmasi(); 
    }
}

