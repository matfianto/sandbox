import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AplikasiKotakDialog extends JFrame
                         implements ActionListener {
    public AplikasiKotakDialog() {
        super("Aplikasi Kotak Dialog");
        setSize(500, 200);
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
    	  JOptionPane.showMessageDialog(null, 
    			"Lihat daku dong!",
    			"Pesan Penting",
    			JOptionPane.INFORMATION_MESSAGE);
    }	

    public static void main(String[] args) {
    	  AplikasiKotakDialog app = new  AplikasiKotakDialog(); 
    }
}

