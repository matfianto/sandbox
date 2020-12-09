import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AplikasiJCheckBox extends JFrame
                      implements ActionListener {
    JCheckBox cekInggris = new JCheckBox("Bahasa Inggris", false);
    JCheckBox cekJerman = new JCheckBox("Bahasa Jerman", false);
    JCheckBox cekMandarin = new JCheckBox("Bahasa Mandarin", false);
    
	
    public AplikasiJCheckBox() {
        super("Aplikasi JCheckBox");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelJudul = new JLabel("Bahasa yang Anda kuasai:");
        
        GridLayout grid = new GridLayout(4, 1); 
        panel.setLayout(grid);

        panel.add(labelJudul);
        panel.add(cekInggris);
        panel.add(cekJerman);
        panel.add(cekMandarin);
        add(panel);
        
        cekInggris.addActionListener(this);
        cekJerman.addActionListener(this);
        cekMandarin.addActionListener(this);
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Dieksekusi kalau tombol diklik
    	  String pilihan = "";
    	  String perintah = e.getActionCommand();
    	
    	  if (cekInggris.isSelected())
    		pilihan = pilihan + "Bahasa Inggris\n";
    	
    	  if (cekJerman.isSelected())
    		pilihan = pilihan + "Bahasa Jerman\n";
    	
    	  if (cekMandarin.isSelected())
    		pilihan = pilihan + "Bahasa Mandarin\n";
    	
    	  if (pilihan.isEmpty())
    		JOptionPane.showMessageDialog(null, 
        			"Tidak ada bahasa yang dicentang");
    	  else
    		JOptionPane.showMessageDialog(null,
    				"Bahasa yang dicentang:\n" +
        			pilihan);
    }	

    public static void main(String[] args) {
    	  AplikasiJCheckBox app = new  AplikasiJCheckBox(); 
    }
}

