import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AplikasiInputDialog extends JFrame
                         implements ActionListener {
    public AplikasiInputDialog() {
        super("Aplikasi Kotak Dialog Masukan");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JButton tombol = new JButton("Kotak dialog");
        
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
    	  String jawaban = JOptionPane.showInputDialog(null, 
    			"Siapa namamu?");
    	
    	  // Tanggapi jawaban
    	  if (jawaban != null)
  	      JOptionPane.showMessageDialog(null, 
        			"Hai, " + jawaban + "!");
    }	

    public static void main(String[] args) {
    	  AplikasiInputDialog app = new  AplikasiInputDialog(); 
    }
}

