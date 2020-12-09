import javax.swing.*;
import java.awt.event.*;

public class LuasPersegiPanjang extends JFrame {
    JTextField fieldTinggi, fieldLebar;
	
    public LuasPersegiPanjang() {
        super("Perhitungan Luas Persegi Panjang");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tambahkan komponen
        JPanel panel = new JPanel();
        JLabel labelTinggi = new JLabel("Tinggi:");
        JLabel labelLebar = new JLabel("Lebar:");
        fieldTinggi = new JTextField(10);
        fieldLebar = new JTextField(10);
        
        JButton tombol = new JButton("Hitung");
        panel.add(labelTinggi);
        panel.add(fieldTinggi);
        
        panel.add(labelLebar);
        panel.add(fieldLebar);
        
        panel.add(tombol);
        add(panel);
        
        // Pasang pemantau klik
        tombol.addActionListener(new ActionListener() {
            double lebarPersegiPanjang = 0, tinggiPersegiPanjang = 0;
            public void actionPerformed(ActionEvent e) {
                // Dieksekusi kalau tombol diklik
            	
                // Cek tinggi
                try {
                    tinggiPersegiPanjang = Double.parseDouble (
                    		fieldTinggi.getText());              	
                }
                catch (NumberFormatException ex) {
                	  JOptionPane.showMessageDialog(null, 
                			"Masukkan bilangan real untuk tinggi");
                	  fieldTinggi.requestFocus();
                	  return;
                }
                
                // Cek lebar
                try {
                    lebarPersegiPanjang = Double.parseDouble (
                    		fieldLebar.getText());              	
                }
                catch (NumberFormatException ex) {
                	  JOptionPane.showMessageDialog(null, 
                			"Masukkan bilangan real untuk lebar");
                	  fieldLebar.requestFocus();
                	  return;
                }
                
                // Hitung luas persegi panjang
                double luasPersegiPanjang =  tinggiPersegiPanjang * 
                                             lebarPersegiPanjang;
                JOptionPane.showMessageDialog(null, 
                		"Luas = " + luasPersegiPanjang);
            }
            
        });
        
        // Tampilkan jendela
        setVisible(true);
        
        // Tengahkan jendela di tengah layar
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
    	  LuasPersegiPanjang jendela = new LuasPersegiPanjang(); 
    }
}

